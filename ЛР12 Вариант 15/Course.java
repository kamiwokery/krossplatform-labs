import java.util.List;

/**
 * Задание 2, п. 15: класс "Курс" (Course).
 * Поля: id, title, category, rating, studentRatings (List<Integer>).
 * Методы: getAverageRating(), getRating(), setRating().
 */
public class Course {

    private String id;
    private String title;
    private String category;
    private int rating;
    private List<Integer> studentRatings;

    public Course(String id, String title, String category, int rating, List<Integer> studentRatings) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.studentRatings = studentRatings;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Integer> getStudentRatings() {
        return studentRatings;
    }

    // средний балл по отзывам студентов
    public double getAverageRating() {
        if (studentRatings == null || studentRatings.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int r : studentRatings) {
            sum += r;
        }
        return (double) sum / studentRatings.size();
    }

    @Override
    public String toString() {
        return id + " | " + title + " (" + category + ") | рейтинг: " + rating
                + String.format(" | средний балл: %.2f", getAverageRating());
    }
}
