/**
 * Задание 1, п. 15: наследник Jazz, поле improvisation.
 */
public class Jazz extends Music {

    private boolean improvisation;

    public Jazz(String title, String id, int duration, boolean improvisation) {
        super(title, id, duration);
        this.improvisation = improvisation;
    }

    public boolean hasImprovisation() {
        return improvisation;
    }

    @Override
    public String toString() {
        return super.toString() + ", импровизация: " + (improvisation ? "да" : "нет");
    }
}
