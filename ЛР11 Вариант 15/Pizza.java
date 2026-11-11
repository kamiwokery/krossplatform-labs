/**
 * Задание 15: производный класс "Пицца" (Pizza) наследует Food.
 * Дополнительное поле: diameter. Переопределяет getTaste().
 * Собственные перегруженные методы addTopping().
 */
public class Pizza extends Food {

    private int diameter;

    public Pizza(String name, int calories, double weight, int diameter) {
        super(name, calories, weight);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String getTaste() {
        return "Вкусная пицца";
    }

    // собственная ПЕРЕГРУЗКА в наследнике
    public void addTopping(String topping) {
        System.out.println("Добавляю начинку: " + topping);
    }

    public void addTopping(String first, String second) {
        System.out.println("Добавляю начинки: " + first + ", " + second);
    }
}
