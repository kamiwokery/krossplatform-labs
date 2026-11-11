import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Лабораторная работа № 14, вариант 15, задание 4.
 * Ввести с клавиатуры в файл 12 вещественных значений мощности.
 * Считать данные из файла и вывести среднюю мощность.
 */
public class Task4 {

    public static void main(String[] args) {
        File f = new File("power.txt");

        // 1. Ввод с клавиатуры в файл
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите 12 вещественных значений мощности:");
            List<String> lines = new ArrayList<>();
            for (int i = 1; i <= 12; i++) {
                System.out.print("  " + i + ": ");
                lines.add(String.valueOf(scanner.nextDouble()));
            }
            Files.write(f.toPath(), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // 2. Чтение из файла и вычисление среднего
        double sum = 0;
        int count = 0;
        System.out.println();
        System.out.println("Значения из файла:");
        try {
            for (String line : Files.readAllLines(f.toPath(), StandardCharsets.UTF_8)) {
                double value = Double.parseDouble(line.trim());
                System.out.print(value + " ");
                sum += value;
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.println();
            System.out.printf("Средняя мощность: %.3f%n", sum / count);
        }
    }
}
