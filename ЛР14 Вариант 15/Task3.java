import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Лабораторная работа № 14, вариант 15, задание 3.
 * Создать текстовый файл 'f' со случайными целыми числами.
 * Записать в файл 'g' все числа, делящиеся на 6,
 * а в файл 'h' — все остальные.
 */
public class Task3 {

    public static void main(String[] args) {
        Random random = new Random();

        // 1. Создание файла со случайными числами
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(String.valueOf(random.nextInt(100) + 1)); // 1..100
        }

        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");

        try {
            Files.write(f.toPath(), numbers, StandardCharsets.UTF_8);

            // 2. Разделение: кратные 6 — в g, остальные — в h
            List<String> divisibleBy6 = new ArrayList<>();
            List<String> others = new ArrayList<>();
            for (String line : Files.readAllLines(f.toPath(), StandardCharsets.UTF_8)) {
                int value = Integer.parseInt(line.trim());
                if (value % 6 == 0) {
                    divisibleBy6.add(line);
                } else {
                    others.add(line);
                }
            }

            Files.write(g.toPath(), divisibleBy6, StandardCharsets.UTF_8);
            Files.write(h.toPath(), others, StandardCharsets.UTF_8);

            System.out.println("f.txt (все числа):     " + String.join(" ", numbers));
            System.out.println("g.txt (кратные 6):     " + String.join(" ", divisibleBy6));
            System.out.println("h.txt (остальные):     " + String.join(" ", others));
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
        }
    }
}
