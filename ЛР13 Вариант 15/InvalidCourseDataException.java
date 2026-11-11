/**
 * Лабораторная работа № 13, вариант 15.
 * Задание 15: пользовательское исключение — неверные данные курса (checked).
 */
public class InvalidCourseDataException extends Exception {

    public InvalidCourseDataException(String message) {
        super(message);
    }
}
