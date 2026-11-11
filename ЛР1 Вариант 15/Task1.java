import java.util.Scanner;

/**
 * Лабораторная работа № 1, вариант 15.
 * Задание 1, пункт 15: рассчитать стоимость покупки
 * (цена товара * количество) с выводом чека.
 * Используются: базовые типы данных, операции, ввод через Scanner.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара: ");
        String product = scanner.nextLine();

        System.out.print("Введите цену за единицу (руб.): ");
        double price = scanner.nextDouble();

        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();

        double total = price * quantity; // стоимость покупки

        System.out.println("================ ЧЕК ================");
        System.out.println("Товар:      " + product);
        System.out.println("Цена:       " + price + " руб.");
        System.out.println("Количество: " + quantity + " шт.");
        System.out.println("ИТОГО:      " + total + " руб.");
        System.out.println("=====================================");
        System.out.println("Спасибо за покупку!");

        scanner.close();
    }
}
