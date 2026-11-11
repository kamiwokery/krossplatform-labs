/**
 * Задание 15: производный класс "Стул" (Chair) наследует Furniture.
 * Уникальное поле: backrest. Вызов super() в конструкторе.
 */
public class Chair extends Furniture {

    private boolean backrest;

    public Chair(String name, String material, double price, boolean backrest) {
        super(name, material, price);
        this.backrest = backrest;
    }

    public boolean hasBackrest() {
        return backrest;
    }

    public void setBackrest(boolean backrest) {
        this.backrest = backrest;
    }

    @Override
    public String getPurpose() {
        return "Для сидения";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Спинка: " + (backrest ? "есть" : "нет") + ", назначение: " + getPurpose());
    }

    // уникальный метод
    public void adjustHeight() {
        System.out.println("Стул \"" + getName() + "\": регулировка высоты (adjustHeight)");
    }
}
