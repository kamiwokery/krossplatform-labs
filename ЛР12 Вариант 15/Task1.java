import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Лабораторная работа № 12, вариант 15.
 * Задание 1, п. 15: Map<String, Music> с названием как ключом.
 * Добавить 3 Rock, 3 Classical, 2 Jazz. Вывести все ключи и значения.
 */
public class Task1 {

    public static void main(String[] args) {
        // LinkedHashMap сохраняет порядок добавления (HashMap — нет)
        Map<String, Music> musicMap = new LinkedHashMap<>();

        // 3 Rock
        musicMap.put("Камни и ветер", new Rock("Камни и ветер", "R-001", 245, true));
        musicMap.put("Гром в горах", new Rock("Гром в горах", "R-002", 198, false));
        musicMap.put("Эхо дороги", new Rock("Эхо дороги", "R-003", 312, true));

        // 3 Classical
        musicMap.put("Весенняя соната", new Classical("Весенняя соната", "C-001", 420, "Филармонический"));
        musicMap.put("Ноктюрн №5", new Classical("Ноктюрн №5", "C-002", 260, "Камерный"));
        musicMap.put("Симфония в ре", new Classical("Симфония в ре", "C-003", 540, "Академический"));

        // 2 Jazz
        musicMap.put("Полночный джаз", new Jazz("Полночный джаз", "J-001", 330, true));
        musicMap.put("Джаз-фьюжн", new Jazz("Джаз-фьюжн", "J-002", 285, false));

        System.out.println("Всего композиций в Map: " + musicMap.size());
        System.out.println();

        System.out.println("=== Ключи (названия) ===");
        for (String key : musicMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("=== Значения ===");
        for (Music music : musicMap.values()) {
            System.out.println(music);
        }

        System.out.println();
        System.out.println("=== Ключи и значения (Map.Entry) ===");
        for (Map.Entry<String, Music> entry : musicMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // получение значения по ключу
        System.out.println();
        System.out.println("По ключу \"Полночный джаз\": " + musicMap.get("Полночный джаз"));
    }
}
