/**
 * Задание 15: класс "Стул" (Chair) реализует Assemblable, Usable.
 * Собственные поля: name, material, backrest.
 */
public class Chair implements Assemblable, Usable {

    private String name;
    private String material;
    private boolean backrest;

    public Chair(String name, String material, boolean backrest) {
        this.name = name;
        this.material = material;
        this.backrest = backrest;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public boolean hasBackrest() {
        return backrest;
    }

    @Override
    public void assemble() {
        System.out.println("Стул \"" + name + "\": собирается, спинка: "
                + (backrest ? "есть" : "нет"));
    }

    @Override
    public void disassemble() {
        System.out.println("Стул \"" + name + "\": разбирается на детали");
    }

    @Override
    public void use() {
        System.out.println("Стул \"" + name + "\": используется для сидения");
    }

    @Override
    public String getPurpose() {
        return "Для сидения";
    }
}
