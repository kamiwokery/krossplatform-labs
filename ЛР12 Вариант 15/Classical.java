/**
 * Задание 1, п. 15: наследник Classical, поле orchestra.
 */
public class Classical extends Music {

    private String orchestra;

    public Classical(String title, String id, int duration, String orchestra) {
        super(title, id, duration);
        this.orchestra = orchestra;
    }

    public String getOrchestra() {
        return orchestra;
    }

    @Override
    public String toString() {
        return super.toString() + ", оркестр: " + orchestra;
    }
}
