import java.util.Scanner;

/**
 * Лабораторная работа № 1, вариант 15.
 * Задание 3, пункт 15: найти наибольший общий делитель (НОД)
 * двух чисел (алгоритм Евклида, цикл while).
 * Используются: цикл while, операция остатка от деления %.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Ошибка: НОД не определён для двух нулей!");
        } else {
            // алгоритм Евклида: делим большее на меньшее,
            // затем делим делитель на остаток, пока остаток не станет 0
            int x = a;
            int y = b;
            while (x != 0 && y != 0) {
                if (x > y) {
                    x = x % y;
                } else {
                    y = y % x;
                }
            }
            System.out.println("НОД(" + a + "; " + b + ") = " + (x + y));
        }

        scanner.close();
    }
}
