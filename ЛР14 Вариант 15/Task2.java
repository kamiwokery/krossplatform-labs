import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Лабораторная работа № 14, вариант 15, задание 2.
 * Ввести с клавиатуры в файл 'f' 10 целых чисел.
 * Вывести их на экран и определить количество чисел, больших 0 и меньших 100.
 */
public class Task2 {

    public static void main(String[] args) {
        File f = new File("f.txt");

        // 1. Ввод с клавиатуры в файл
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите 10 целых чисел:");
            List<String> lines = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                System.out.print("  " + i + ": ");
                lines.add(String.valueOf(scanner.nextInt()));
            }
            Files.write(f.toPath(), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // 2. Чтение из файла, вывод и подсчёт (0 < x < 100)
        System.out.println();
        System.out.println("Числа из файла:");
        int countInRange = 0;
        try {
            for (String line : Files.readAllLines(f.toPath(), StandardCharsets.UTF_8)) {
                int value = Integer.parseInt(line.trim());
                System.out.print(value + " ");
                if (value > 0 && value < 100) {
                    countInRange++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        System.out.println();
        System.out.println("Количество чисел, больших 0 и меньших 100: " + countInRange);
    }
}
