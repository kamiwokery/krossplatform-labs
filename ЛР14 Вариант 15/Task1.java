import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * Лабораторная работа № 14, вариант 15, задание 1.
 * Создать файл с информацией о своём любимом празднике.
 * Вывести данные об этом файле. Вывести информацию из файла.
 */
public class Task1 {

    public static void main(String[] args) {
        File file = new File("holiday.txt");

        // 1. Создание файла с информацией о любимом празднике
        String info = """
                Любимый праздник: Новый год
                Когда: 31 декабря — 1 января
                Что нравится: нарядная ёлка, мандарины, подарки
                Традиции: встреча праздника с семьёй и друзьями
                Настроение: волшебство, снег, ожидание чуда""";

        try {
            Files.writeString(file.toPath(), info, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // 2. Данные об этом файле (java.io.File)
        System.out.println("=== Данные о файле ===");
        System.out.println("Имя:        " + file.getName());
        System.out.println("Путь:       " + file.getPath());
        System.out.println("Полный путь:" + file.getAbsolutePath());
        System.out.println("Размер:     " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
        System.out.println("Чтение:     " + file.canRead());
        System.out.println("Запись:     " + file.canWrite());
        System.out.println("Это файл:   " + file.isFile());
        System.out.println("Родитель:   " + file.getParent());
        System.out.println("Изменён:    " + new java.util.Date(file.lastModified()));

        // 3. Информация из файла
        System.out.println();
        System.out.println("=== Содержимое файла ===");
        try {
            for (String line : Files.readAllLines(file.toPath(), StandardCharsets.UTF_8)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
