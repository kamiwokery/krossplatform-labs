/**
 * Лабораторная работа № 9, вариант 15.
 * Задание 15: абстрактный класс "Блюдо" (Meal).
 * 3 приватных поля, конструктор с параметрами, геттеры/сеттеры,
 * абстрактные методы cook(), getCaloriesPer100g(),
 * конкретный метод displayInfo().
 */
public abstract class Meal {

    private String name;
    private double weight;
    private int cookingTime;

    public Meal(String name, double weight, int cookingTime) {
        this.name = name;
        this.weight = weight;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    // абстрактные методы — реализуются только в наследниках
    public abstract void cook();

    public abstract int getCaloriesPer100g();

    // конкретный метод с реализацией
    public void displayInfo() {
        System.out.println("Блюдо: " + name + ", вес: " + weight
                + " г, время готовки: " + cookingTime + " мин");
    }
}
