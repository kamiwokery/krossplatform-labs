/**
 * Лабораторная работа № 5, вариант 15.
 * Задание 2, п. 15: класс "Страна" (name, population, capital).
 */
public class Country {

    private String name;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }
}
