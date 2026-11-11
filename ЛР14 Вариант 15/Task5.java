import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Лабораторная работа № 14, вариант 15, задание 5.
 * Создать текстовый файл 'f' с 10 целыми числами.
 * Считать числа и вывести количество чисел, кратных 9.
 */
public class Task5 {

    public static void main(String[] args) {
        Random random = new Random();
        File f = new File("f.txt");

        // 1. Создание файла с 10 целыми числами
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(String.valueOf(random.nextInt(100) + 1)); // 1..100
        }

        try {
            Files.write(f.toPath(), numbers, StandardCharsets.UTF_8);

            // 2. Чтение и подсчёт кратных 9
            int count = 0;
            System.out.println("Числа из файла:");
            for (String line : Files.readAllLines(f.toPath(), StandardCharsets.UTF_8)) {
                int value = Integer.parseInt(line.trim());
                System.out.print(value + " ");
                if (value % 9 == 0) {
                    count++;
                }
            }
            System.out.println();
            System.out.println("Количество чисел, кратных 9: " + count);
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлом: " + e.getMessage());
        }
    }
}
