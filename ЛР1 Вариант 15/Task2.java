import java.util.Scanner;

/**
 * Лабораторная работа № 1, вариант 15.
 * Задание 2, пункт 15: ввести день недели (1-7).
 * Вывести "Рабочий день" или "Выходной" (где 6, 7 - выходной).
 * Используются: условный оператор switch, break, default.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Ошибка: неверный номер дня недели!");
        }

        scanner.close();
    }
}
