/**
 * Лабораторная работа № 3, вариант 15.
 * Задание 3: класс Employee (fullname, salary), массив объектов,
 * класс Report со статическим методом generateReport.
 * Форматирование строк через printf.
 */
public class Task3 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 1250.75),
                new Employee("Петрова Мария Сергеевна", 980.4),
                new Employee("Сидоров Пётр Алексеевич", 1500.0),
                new Employee("Козлова Анна Викторовна", 1120.55)
        };

        Report.generateReport(employees);
    }
}
