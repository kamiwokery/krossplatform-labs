/**
 * Лабораторная работа № 5, вариант 15.
 * Задание 1, п. 15: класс "Счетчик" (Counter).
 * Поля: count (int). Конструктор устанавливает 0.
 * Методы: increment(), decrement(), getValue().
 */
public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }
}
