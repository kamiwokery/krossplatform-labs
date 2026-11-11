/**
 * Лабораторная работа № 11, вариант 15.
 * Задание 15: создать блюда, вызвать перегруженные методы.
 * Демонстрация: перегрузка (compile time), переопределение (runtime),
 * сравнение статического и динамического полиморфизма.
 */
public class Task15 {

    public static void main(String[] args) {
        Food food = new Food("Простая еда", 100, 150);
        Pizza pizza = new Pizza("Пепперони", 290, 500, 30);
        Soup soup = new Soup("Борщ", 45, 300, "капуста, свёкла, мясо");

        // 1. ПЕРЕГРУЗКА (статический полиморфизм) — версия выбирается
        // на этапе КОМПИЛЯЦИИ по параметрам вызова
        System.out.println("=== Перегрузка cook() ===");
        pizza.cook();              // cook()
        pizza.cook(25);            // cook(int minutes)
        pizza.cook("запекание");   // cook(String method)
        soup.cook(40);
        soup.cook("варка");

        System.out.println();
        System.out.println("=== Собственная перегрузка в наследниках ===");
        pizza.addTopping("сыр");
        pizza.addTopping("сыр", "грибы");
        soup.stir();
        soup.stir(3);

        // 2. ПЕРЕОПРЕДЕЛЕНИЕ (динамический полиморфизм) — вызов через
        // ссылку базового типа выбирается во время ВЫПОЛНЕНИЯ по реальному типу объекта
        System.out.println();
        System.out.println("=== Переопределение getTaste() (полиморфизм) ===");
        Food[] dishes = {food, pizza, soup, new Pizza("Маргарита", 260, 450, 26)};
        for (Food d : dishes) {
            System.out.println(d.getName() + " -> " + d.getTaste());
        }

        // 3. Сравнение: одна и та же строка кода d.cook() печатает
        // разный результат, а версия cook(...) уже не меняется
        System.out.println();
        System.out.println("=== Сравнение статического и динамического полиморфизма ===");
        for (Food d : dishes) {
            System.out.print("Динамический (getTaste): " + d.getTaste() + ". | ");
            d.cook(); // статический выбор версии cook() уже зафиксирован компилятором
        }

        System.out.println();
        System.out.println();
        pizza.displayInfo();
        soup.displayInfo();
        food.displayInfo();
    }
}
