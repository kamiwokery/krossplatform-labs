import java.util.Scanner;

/**
 * Лабораторная работа № 3, вариант 15.
 * Задание 2, пункт 15: проверить, содержит ли строка только буквы и цифры.
 * Используются: метод matches с регулярным выражением [\p{L}\p{N}]+
 * и проверка вручную через Character.isLetterOrDigit.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        // способ 1: регулярное выражение
        boolean onlyLettersAndDigits = str.matches("[\\p{L}\\p{N}]+");
        System.out.println("matches(): " + (onlyLettersAndDigits ? "да" : "нет"));

        // способ 2: проверка каждого символа вручную
        boolean manualCheck = !str.isEmpty();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                manualCheck = false;
                break;
            }
        }
        System.out.println("Вручную:  " + (manualCheck ? "да" : "нет"));

        scanner.close();
    }
}
