/**
 * Лабораторная работа № 8, вариант 15.
 * Задание 15: базовый класс "Мебель" (Furniture).
 * 3 приватных поля, конструктор с параметрами, геттеры и сеттеры.
 */
public class Furniture {

    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPurpose() {
        return "Предмет мебели";
    }

    public void displayInfo() {
        System.out.println("Название: " + name + ", материал: " + material + ", цена: " + price + " руб.");
    }
}
