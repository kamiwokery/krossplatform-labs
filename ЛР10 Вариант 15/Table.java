/**
 * Задание 15: класс "Стол" (Table) реализует Assemblable, Usable.
 * Собственные поля: name, material, legs.
 */
public class Table implements Assemblable, Usable {

    private String name;
    private String material;
    private int legs;

    public Table(String name, String material, int legs) {
        this.name = name;
        this.material = material;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public void assemble() {
        System.out.println("Стол \"" + name + "\": собирается, ножек: " + legs);
    }

    @Override
    public void disassemble() {
        System.out.println("Стол \"" + name + "\": разбирается на детали");
    }

    @Override
    public void use() {
        System.out.println("Стол \"" + name + "\": используется как рабочая поверхность");
    }

    @Override
    public String getPurpose() {
        return "Служит поверхностью";
    }
}
