/**
 * Лабораторная работа № 5, вариант 15.
 * Задание 3, п. 15: создать 6 автомобилей
 * и вывести все автомобили типа SUV.
 */
public class Task3 {

    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW X5", Type.SUV),
                new Car("Toyota Camry", Type.SEDAN),
                new Car("Mercedes GLC", Type.SUV),
                new Car("VW Golf", Type.HATCHBACK),
                new Car("Porsche 911", Type.COUPE),
                new Car("Audi A3", Type.HATCHBACK)
        };

        System.out.println("Автомобили типа SUV:");
        for (Car c : cars) {
            if (c.getType() == Type.SUV) {
                System.out.println("- " + c);
            }
        }

        System.out.println("Все автомобили:");
        for (Car c : cars) {
            System.out.println("- " + c);
        }
    }
}
