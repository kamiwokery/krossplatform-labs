/**
 * Задание 15: производный класс "Стол" (Table) наследует Furniture.
 * Уникальное поле: legs. Вызов super() в конструкторе.
 */
public class Table extends Furniture {

    private int legs;

    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String getPurpose() {
        return "Служит поверхностью";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ножек: " + legs + ", назначение: " + getPurpose());
    }

    // уникальный метод
    public void fold() {
        System.out.println("Стол \"" + getName() + "\": складывается (fold)");
    }
}
