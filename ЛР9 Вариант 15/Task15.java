/**
 * Лабораторная работа № 9, вариант 15.
 * Задание 15: 2 супа и 3 пасты, вывод калорийности.
 * Полиморфный вызов методов через массив абстрактного типа Meal[].
 *
 * Объект абстрактного класса создать нельзя:
 *   Meal m = new Meal("Блюдо", 100, 10);  // ОШИБКА КОМПИЛЯЦИИ
 * Допустима только ссылка, инициализируемая объектом наследника:
 *   Meal m = new Soup("Борщ", 300, 40, "капуста, свёкла");
 */
public class Task15 {

    public static void main(String[] args) {
        Meal[] meals = new Meal[5];
        meals[0] = new Soup("Борщ", 300, 40, "капуста, свёкла, мясо");
        meals[1] = new Soup("Куриный суп", 280, 40, "курица, лапша, зелень");
        meals[2] = new Pasta("Спагетти", 200, 10, "длинная");
        meals[3] = new Pasta("Пенне", 180, 10, "короткая");
        meals[4] = new Pasta("Фарфалле", 190, 10, "бабочка");

        System.out.println("=== Приготовление ===");
        for (Meal m : meals) {
            m.cook();
        }

        System.out.println();
        System.out.println("=== Калорийность ===");
        for (Meal m : meals) {
            // полиморфный вызов: для каждого объекта вызывается своя реализация
            System.out.println(m.getName() + ": " + m.getCaloriesPer100g() + " ккал/100 г");
        }

        System.out.println();
        System.out.println("=== Подробная информация ===");
        for (Meal m : meals) {
            m.displayInfo();
            System.out.println();
        }

        // средняя калорийность всех блюд
        int sum = 0;
        for (Meal m : meals) {
            sum += m.getCaloriesPer100g();
        }
        System.out.println("Средняя калорийность: " + (sum / meals.length) + " ккал/100 г");
    }
}
