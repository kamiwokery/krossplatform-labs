/**
 * Лабораторная работа № 7, вариант 15.
 * Задание 15: создать 4 планеты и вывести среднее число спутников.
 * Демонстрация статических полей и статических методов.
 */
public class Task15 {

    public static void main(String[] args) {
        Planet p1 = new Planet("Юпитер", 139820, 95);
        Planet p2 = new Planet("Сатурн", 116460, 146);
        Planet p3 = new Planet("Уран", 50724, 28);
        Planet p4 = new Planet("Нептун", 49244, 16);

        System.out.println("Созданные планеты:");
        Planet[] planets = {p1, p2, p3, p4};
        for (Planet p : planets) {
            System.out.printf("- %-8s диаметр %s км, спутников: %d%n",
                    p.getName(), p.getDiameter(), p.getMoons());
        }

        System.out.println();

        // обращение к статическим полям через имя класса (объект не нужен)
        System.out.println("Planet.totalPlanets = " + Planet.totalPlanets);
        System.out.println("Planet.totalMoons   = " + Planet.totalMoons);

        System.out.println();

        // вызов статического метода через имя класса
        Planet.printStatistics();
        System.out.printf("%nСреднее число спутников (getAverageMoons): %.2f%n",
                Planet.getAverageMoons());
    }
}
