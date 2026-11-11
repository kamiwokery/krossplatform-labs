/**
 * Класс отчёта со статическим методом формирования
 * отчёта о зарплатах сотрудников.
 * Лабораторная работа № 3, вариант 15, задание 3.
 */
public class Report {

    /**
     * Выводит информацию о зарплате всех сотрудников.
     * Фамилия выровнена по левому краю (15 символов),
     * зарплата — по правому краю, 2 знака после запятой.
     *
     * @param employees массив сотрудников
     */
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %12s%n", "Фамилия", "Зарплата");
        System.out.println("------------------------------------");
        for (Employee e : employees) {
            String surname = e.fullname.split(" ")[0];
            System.out.printf("%-15s %12.2f%n", surname, e.salary);
        }
    }
}
