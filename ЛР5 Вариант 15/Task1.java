/**
 * Лабораторная работа № 5, вариант 15.
 * Задание 1, п. 15: создать счетчик, увеличить его 5 раз,
 * уменьшить 2 раза, вывести значение.
 */
public class Task1 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        for (int i = 0; i < 2; i++) {
            counter.decrement();
        }

        System.out.println("Значение счетчика: " + counter.getValue());
    }
}
