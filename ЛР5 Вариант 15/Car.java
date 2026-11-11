/**
 * Лабораторная работа № 5, вариант 15.
 * Задание 3, п. 15: класс "Автомобиль" (model, type).
 */
public class Car {

    private String model;
    private Type type;

    public Car(String model, Type type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return model + " (" + type + ")";
    }
}
