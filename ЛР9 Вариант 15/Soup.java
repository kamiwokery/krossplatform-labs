/**
 * Задание 15: конкретный класс "Суп" (Soup) наследует Meal.
 * Реализует все абстрактные методы, добавляет уникальное поле ingredients.
 */
public class Soup extends Meal {

    private String ingredients;

    public Soup(String name, double weight, int cookingTime, String ingredients) {
        super(name, weight, cookingTime);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public void cook() {
        System.out.println(getName() + ": варится 40 минут");
    }

    @Override
    public int getCaloriesPer100g() {
        return 50;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ингредиенты: " + ingredients
                + ", калорийность: " + getCaloriesPer100g() + " ккал/100 г");
    }
}
