import java.util.Scanner;

/**
 * Лабораторная работа № 2, вариант 15.
 * Задание 2, пункт 15: дан двумерный массив. Найти сумму элементов массива,
 * начиная с элемента, индексы которого вводит пользователь,
 * и заканчивая элементом, индексы которого вводит пользователь.
 * Используются: двумерные массивы, length, вложенные циклы for.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Матрица " + matrix.length + "x" + matrix[0].length + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("Введите индекс строки начального элемента: ");
        int i1 = scanner.nextInt();
        System.out.print("Введите индекс столбца начального элемента: ");
        int j1 = scanner.nextInt();
        System.out.print("Введите индекс строки конечного элемента: ");
        int i2 = scanner.nextInt();
        System.out.print("Введите индекс столбца конечного элемента: ");
        int j2 = scanner.nextInt();

        if (i1 < 0 || i1 >= matrix.length || j1 < 0 || j1 >= matrix[0].length
                || i2 < 0 || i2 >= matrix.length || j2 < 0 || j2 >= matrix[0].length) {
            System.out.println("Ошибка: индексы выходят за пределы массива!");
        } else if (i1 > i2 || (i1 == i2 && j1 > j2)) {
            System.out.println("Ошибка: начальный элемент должен идти раньше конечного!");
        } else {
            // сумма элементов прямоугольника от (i1, j1) до (i2, j2)
            int sum = 0;
            for (int i = i1; i <= i2; i++) {
                int startJ = (i == i1) ? j1 : 0;
                int endJ = (i == i2) ? j2 : matrix[i].length - 1;
                for (int j = startJ; j <= endJ; j++) {
                    sum += matrix[i][j];
                }
            }
            System.out.println("Сумма элементов от (" + i1 + "; " + j1
                    + ") до (" + i2 + "; " + j2 + ") = " + sum);
        }

        scanner.close();
    }
}
