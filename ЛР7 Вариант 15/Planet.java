/**
 * Лабораторная работа № 7, вариант 15.
 * Задание 15: класс "Планета" (Planet).
 * Нестатические поля: name, diameter, moons.
 * Статические поля: totalPlanets, totalMoons.
 * Конструктор увеличивает оба счетчика.
 * Статический метод getAverageMoons() — среднее число спутников.
 */
public class Planet {

    // нестатические поля — состояние конкретной планеты
    private String name;
    private double diameter;
    private int moons;

    // статические поля — состояние всего класса (общие для всех объектов)
    public static int totalPlanets = 0;
    public static int totalMoons = 0;

    public Planet(String name, double diameter, int moons) {
        this.name = name;
        this.diameter = diameter;
        this.moons = moons;
        // конструктор увеличивает оба счетчика
        totalPlanets++;
        totalMoons += moons;
    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getMoons() {
        return moons;
    }

    // статический метод вызывается через имя класса: Planet.getAverageMoons()
    public static double getAverageMoons() {
        if (totalPlanets == 0) {
            return 0;
        }
        return (double) totalMoons / totalPlanets;
    }

    // статический метод общей статистики по классу
    public static void printStatistics() {
        System.out.println("Всего планет: " + totalPlanets);
        System.out.println("Всего спутников: " + totalMoons);
        System.out.printf("Среднее число спутников: %.2f%n", getAverageMoons());
    }
}
