import java.util.Scanner;

/**
 * Лабораторная работа № 3, вариант 15.
 * Задание 1, пункт 15: заменить все пробелы на символ подчеркивания (replace).
 * Используются: класс String, метод replace.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        String result = str.replace(' ', '_');

        System.out.println("До:    [" + str + "]");
        System.out.println("После: [" + result + "]");

        scanner.close();
    }
}
