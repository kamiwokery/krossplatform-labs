/**
 * Задание 15: производный класс "Суп" (Soup) наследует Food.
 * Дополнительное поле: ingredients. Переопределяет getTaste().
 * Собственные перегруженные методы stir().
 */
public class Soup extends Food {

    private String ingredients;

    public Soup(String name, int calories, double weight, String ingredients) {
        super(name, calories, weight);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String getTaste() {
        return "Вкусный суп";
    }

    // собственная ПЕРЕГРУЗКА в наследнике
    public void stir() {
        System.out.println("Перемешиваю суп: " + ingredients);
    }

    public void stir(int times) {
        System.out.println("Перемешиваю суп " + times + " раз: " + ingredients);
    }
}
