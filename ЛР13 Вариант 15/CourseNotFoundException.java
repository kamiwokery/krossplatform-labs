/**
 * Задание 15: пользовательское исключение — курс не найден (checked).
 */
public class CourseNotFoundException extends Exception {

    private String courseName;

    public CourseNotFoundException(String message, String courseName) {
        super(message);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
