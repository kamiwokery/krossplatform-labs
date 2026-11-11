import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Лабораторная работа № 13, вариант 15.
 * Задание 15: система курсов — операции записи с обработкой исключений.
 * Исключения: InvalidCourseDataException, CourseNotFoundException, EnrollmentException.
 */
public class Task15 {

    // поиск курса по названию
    private static Course findCourse(Map<String, Course> courses, String name)
            throws CourseNotFoundException {
        Course course = courses.get(name);
        if (course == null) {
            throw new CourseNotFoundException("Курс не найден: \"" + name + "\"", name);
        }
        return course;
    }

    public static void main(String[] args) {
        Map<String, Course> courses = new LinkedHashMap<>();

        // 1. Некорректные данные -> InvalidCourseDataException
        System.out.println("=== Создание курсов ===");
        try {
            new Course("Битые данные", "Иванов", -10, 100, 10);
        } catch (InvalidCourseDataException e) {
            System.out.println("[InvalidCourseDataException] " + e.getMessage());
        }
        try {
            new Course("Битые данные 2", "Иванов", 40, -5, 10);
        } catch (InvalidCourseDataException e) {
            System.out.println("[InvalidCourseDataException] " + e.getMessage());
        }

        // 2. Корректные курсы
        try {
            Course java = new Course("Java: основы", "Петров", 72, 450, 2);
            Course sql = new Course("SQL и базы данных", "Сидорова", 36, 300, 3);
            courses.put(java.getName(), java);
            courses.put(sql.getName(), sql);
        } catch (InvalidCourseDataException e) {
            System.out.println("[InvalidCourseDataException] " + e.getMessage());
        }

        courses.values().forEach(c -> System.out.println("  " + c));

        // 3. Запись студентов: переполнение и дубликат -> EnrollmentException
        System.out.println();
        System.out.println("=== Запись студентов ===");
        try {
            findCourse(courses, "Java: основы").enroll("Алиса");
            findCourse(courses, "Java: основы").enroll("Борис");
            findCourse(courses, "Java: основы").enroll("Вера"); // мест нет
        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }

        try {
            findCourse(courses, "Java: основы").enroll("Алиса"); // дубликат
        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }

        // 4. Курс не найден -> CourseNotFoundException
        System.out.println();
        System.out.println("=== Поиск курса ===");
        try {
            findCourse(courses, "Python: продвинутый").enroll("Глеб");
        } catch (CourseNotFoundException e) {
            System.out.println("[CourseNotFoundException] " + e.getMessage()
                    + " (поле courseName: " + e.getCourseName() + ")");
        } catch (EnrollmentException e) {
            System.out.println("[EnrollmentException] " + e.getMessage());
        }

        // 5. Отмена записи
        System.out.println();
        System.out.println("=== Отмена записи ===");
        try {
            findCourse(courses, "SQL и базы данных").enroll("Джейн");
            findCourse(courses, "SQL и базы данных").cancelEnrollment("Джейн");
            findCourse(courses, "SQL и базы данных").cancelEnrollment("Неизвестный");
        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }

        // 6. finally выполняется всегда
        System.out.println();
        System.out.println("=== finally ===");
        try {
            Course c = findCourse(courses, "Java: основы");
            System.out.println("Состояние курса: " + c);
        } catch (CourseNotFoundException e) {
            System.out.println("[CourseNotFoundException] " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен (всегда)");
        }

        // Итоговое состояние системы курсов
        System.out.println();
        System.out.println("=== Итоговое состояние ===");
        for (Course c : courses.values()) {
            System.out.println(c);
            System.out.println("  Студенты: " + c.getEnrolledStudents());
        }
    }
}
