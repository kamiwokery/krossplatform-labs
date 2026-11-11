import java.util.Scanner;

/**
 * Лабораторная работа № 2, вариант 15.
 * Задание 1, пункт 15: переставить местами первый и последний элемент массива.
 * Используются: одномерные массивы, операция new, length, индексы, цикл for.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Ошибка: в массиве должен быть хотя бы 2 элемента!");
            scanner.close();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("До:    ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // перестановка первого и последнего элемента
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        System.out.print("После: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
