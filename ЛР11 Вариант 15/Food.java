/**
 * Лабораторная работа № 11, вариант 15.
 * Задание 15: базовый класс "Еда" (Food).
 * Поля: name, calories, weight. Конструктор.
 * Перегруженные методы cook() — 3 версии (статический полиморфизм).
 * Метод getTaste() — для переопределения в наследниках (динамический).
 */
public class Food {

    private String name;
    private int calories;
    private double weight;

    public Food(String name, int calories, double weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getWeight() {
        return weight;
    }

    // ПЕРЕГРУЗКА (Overloading) — версия 1: без параметров
    public void cook() {
        System.out.println("Готовлю еду: " + name);
    }

    // ПЕРЕГРУЗКА — версия 2: параметр int
    public void cook(int minutes) {
        System.out.println("Готовлю " + name + " " + minutes + " минут");
    }

    // ПЕРЕГРУЗКА — версия 3: параметр String
    public void cook(String method) {
        System.out.println("Готовлю " + name + " методом " + method);
    }

    // метод для ПЕРЕОПРЕДЕЛЕНИЯ (Overriding) в наследниках
    public String getTaste() {
        return "Нейтральный вкус";
    }

    public void displayInfo() {
        System.out.println(name + " (ккал: " + calories + ", вес: " + weight + " г)");
    }
}
