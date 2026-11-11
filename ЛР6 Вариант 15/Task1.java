/**
 * Лабораторная работа № 6, вариант 15.
 * Задание 1, п. 15: создать человека и вывести его возраст.
 * Поля класса Person скрыты (private), доступ — только через геттеры.
 */
public class Task1 {

    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов", 2005);

        System.out.println("Фамилия:  " + person.getLastName());
        System.out.println("Имя:      " + person.getFirstName());
        System.out.println("Год рождения: " + person.getBirthYear());
        System.out.println("Возраст:  " + person.getAge() + " лет");
        System.out.println(person.getFullName());
    }
}
