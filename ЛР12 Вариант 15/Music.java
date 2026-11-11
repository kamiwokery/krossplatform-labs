/**
 * Лабораторная работа № 12, вариант 15.
 * Задание 1, п. 15: базовый класс "Музыка" (Music).
 * Поля: title, id, duration.
 */
public class Music {

    private String title;
    private String id;
    private int duration;

    public Music(String title, String id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " \"" + title + "\" (id: " + id
                + ", " + duration + " сек.)";
    }
}
