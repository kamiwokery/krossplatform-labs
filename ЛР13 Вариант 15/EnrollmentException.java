/**
 * Задание 15: пользовательское исключение — ошибка записи на курс (checked).
 */
public class EnrollmentException extends Exception {

    public EnrollmentException(String message) {
        super(message);
    }
}
