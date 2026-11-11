import java.time.Year;

/**
 * Лабораторная работа № 6, вариант 15.
 * Задание 1, п. 15: класс "Человек" (Person).
 * Поля: firstName, lastName, birthYear — private (инкапсуляция).
 * Конструктор. Геттеры. Метод getAge() вычисляет возраст.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // возраст вычисляется по текущему году
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }
}
