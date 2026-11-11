import java.util.ArrayList;
import java.util.List;

/**
 * Задание 15: сущность "Курс" (Course).
 * Поля: name, teacher, duration, price, maxStudents.
 * Конструктор с проверкой: длительность > 0, цена >= 0.
 * Методы: enroll(String student), cancelEnrollment(String student).
 */
public class Course {

    private String name;
    private String teacher;
    private double duration;
    private double price;
    private int maxStudents;
    private List<String> enrolledStudents;

    public Course(String name, String teacher, double duration, double price, int maxStudents)
            throws InvalidCourseDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidCourseDataException("Название курса не может быть пустым");
        }
        if (duration <= 0) {
            throw new InvalidCourseDataException(
                    "Длительность должна быть больше 0, указано: " + duration);
        }
        if (price < 0) {
            throw new InvalidCourseDataException(
                    "Цена не может быть отрицательной, указана: " + price);
        }
        if (maxStudents <= 0) {
            throw new InvalidCourseDataException(
                    "Максимальное число студентов должно быть больше 0, указано: " + maxStudents);
        }
        this.name = name;
        this.teacher = teacher;
        this.duration = duration;
        this.price = price;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public double getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    // запись студента на курс
    public void enroll(String student) throws EnrollmentException {
        if (student == null || student.isEmpty()) {
            throw new EnrollmentException("Имя студента не может быть пустым");
        }
        if (enrolledStudents.contains(student)) {
            throw new EnrollmentException(
                    "Студент \"" + student + "\" уже записан на курс \"" + name + "\"");
        }
        if (enrolledStudents.size() >= maxStudents) {
            throw new EnrollmentException(
                    "Нет свободных мест на курсе \"" + name + "\" (мест: " + maxStudents + ")");
        }
        enrolledStudents.add(student);
        System.out.println("Записан: " + student + " -> " + name);
    }

    // отмена записи студента
    public void cancelEnrollment(String student) throws EnrollmentException {
        if (!enrolledStudents.remove(student)) {
            throw new EnrollmentException(
                    "Студент \"" + student + "\" не записан на курс \"" + name + "\"");
        }
        System.out.println("Отменена запись: " + student + " <- " + name);
    }

    @Override
    public String toString() {
        return "\"" + name + "\" | преподаватель: " + teacher
                + String.format(" | %s ч | %.2f руб. | мест: %d/%d",
                duration, price, enrolledStudents.size(), maxStudents);
    }
}
