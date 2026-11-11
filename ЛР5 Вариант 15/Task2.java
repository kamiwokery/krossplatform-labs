/**
 * Лабораторная работа № 5, вариант 15.
 * Задание 2, п. 15: массив из 5 стран. Найти страну
 * с максимальным населением и вывести все столицы.
 */
public class Task2 {

    public static void main(String[] args) {
        Country[] countries = {
                new Country("Беларусь", 9200000, "Минск"),
                new Country("Россия", 146000000, "Москва"),
                new Country("Польша", 38000000, "Варшава"),
                new Country("Германия", 83000000, "Берлин"),
                new Country("Франция", 67000000, "Париж")
        };

        // поиск страны с максимальным населением
        Country maxPopulation = countries[0];
        for (Country c : countries) {
            if (c.getPopulation() > maxPopulation.getPopulation()) {
                maxPopulation = c;
            }
        }

        System.out.println("Страна с максимальным населением: "
                + maxPopulation.getName() + " (" + maxPopulation.getPopulation() + " чел.)");

        System.out.println("Все столицы:");
        for (Country c : countries) {
            System.out.println("- " + c.getCapital());
        }
    }
}
