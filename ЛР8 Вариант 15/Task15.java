/**
 * Лабораторная работа № 8, вариант 15.
 * Задание 15: тестовый класс.
 * Массив базового типа на 5 элементов: 3 стола и 2 стула,
 * демонстрация уникальных методов через приведение типа.
 */
public class Task15 {

    public static void main(String[] args) {
        Furniture[] items = new Furniture[5];
        items[0] = new Table("Обеденный стол", "дуб", 450.0, 4);
        items[1] = new Table("Письменный стол", "ЛДСП", 320.0, 4);
        items[2] = new Table("Журнальный стол", "стекло", 180.0, 3);
        items[3] = new Chair("Офисный стул", "текстиль", 120.0, true);
        items[4] = new Chair("Стул деревянный", "берёза", 90.0, false);

        System.out.println("=== Список мебели ===");
        for (Furniture f : items) {
            System.out.println(f.getClass().getSimpleName() + ":");
            f.displayInfo();
            System.out.println();
        }

        // демонстрация уникальных методов производных классов
        System.out.println("=== Уникальные методы ===");
        for (Furniture f : items) {
            if (f instanceof Table) {
                ((Table) f).fold();
            } else if (f instanceof Chair) {
                ((Chair) f).adjustHeight();
            }
        }

        // наследованный геттер работает и для объектов подкласса
        System.out.println();
        System.out.println("Цена первого предмета: " + items[0].getPrice() + " руб.");
    }
}
