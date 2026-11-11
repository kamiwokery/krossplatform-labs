/**
 * Задание 15: конкретный класс "Паста" (Pasta) наследует Meal.
 * Реализует все абстрактные методы, добавляет уникальное поле type.
 */
public class Pasta extends Meal {

    private String type;

    public Pasta(String name, double weight, int cookingTime, String type) {
        super(name, weight, cookingTime);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void cook() {
        System.out.println(getName() + ": варится 10 минут");
    }

    @Override
    public int getCaloriesPer100g() {
        return 130;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: " + type
                + ", калорийность: " + getCaloriesPer100g() + " ккал/100 г");
    }
}
