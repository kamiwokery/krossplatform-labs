import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Лабораторная работа № 12, вариант 15.
 * Задание 2, п. 15: операции над List<Course>:
 * 1) удалить курсы со средним рейтингом < 3;
 * 2) повысить рейтинг курсов со средним рейтингом >= 4;
 * 3) printCourses(List<Course>, int rating) — печать курсов с рейтингом;
 * 4) упорядочить по убыванию среднего балла, при совпадении — по алфавиту
 *    названия; вывести ID, название и средний рейтинг.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("C-01", "Java: основы", "Программирование", 4,
                List.of(5, 4, 4, 5)));
        courses.add(new Course("C-02", "Базы данных", "Программирование", 5,
                List.of(5, 5, 4, 5)));
        courses.add(new Course("C-03", "Английский A1", "Языки", 3,
                List.of(2, 2, 3, 2)));      // средний < 3 — будет удалён
        courses.add(new Course("C-04", "Графический дизайн", "Дизайн", 4,
                List.of(4, 4, 3, 4)));      // средний >= 4 — рейтинг повысится
        courses.add(new Course("C-05", "Психология", "Гуманитарные", 3,
                List.of(3, 4, 3, 3)));      // средний между 3 и 4 — без изменений
        courses.add(new Course("C-06", "Курсы рисунка", "Дизайн", 2,
                List.of(2, 1, 2, 2)));      // средний < 3 — будет удалён
        courses.add(new Course("C-07", "Математика для ИТ", "Программирование", 5,
                List.of(5, 4, 5, 4)));      // средний >= 4 — рейтинг повысится

        System.out.println("=== Исходный список ===");
        courses.forEach(System.out::println);

        // 1. Удалить курсы со средним рейтингом < 3
        courses.removeIf(c -> c.getAverageRating() < 3);

        System.out.println();
        System.out.println("=== После удаления (средний < 3) ===");
        courses.forEach(System.out::println);

        // 2. Повысить рейтинг курсов со средним рейтингом >= 4
        for (Course c : courses) {
            if (c.getAverageRating() >= 4) {
                c.setRating(c.getRating() + 1);
            }
        }

        System.out.println();
        System.out.println("=== После повышения рейтинга (средний >= 4) ===");
        courses.forEach(System.out::println);

        // 3. Печать курсов с выбранным рейтингом
        System.out.println();
        printCourses(courses, 5);

        // 4. Сортировка: по убыванию среднего балла, далее по алфавиту названия
        courses.sort(Comparator
                .comparingDouble(Course::getAverageRating).reversed()
                .thenComparing(Course::getTitle));

        System.out.println();
        System.out.println("=== Отсортированный список (ID, название, средний балл) ===");
        for (Course c : courses) {
            System.out.printf("%s | %s | %.2f%n", c.getId(), c.getTitle(), c.getAverageRating());
        }
    }

    public static void printCourses(List<Course> courses, int rating) {
        System.out.println("Курсы с рейтингом " + rating + ":");
        boolean found = false;
        for (Course c : courses) {
            if (c.getRating() == rating) {
                System.out.println("- " + c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("- не найдены");
        }
    }
}
