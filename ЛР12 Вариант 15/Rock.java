/**
 * Задание 1, п. 15: наследник Rock, поле guitarSolo.
 */
public class Rock extends Music {

    private boolean guitarSolo;

    public Rock(String title, String id, int duration, boolean guitarSolo) {
        super(title, id, duration);
        this.guitarSolo = guitarSolo;
    }

    public boolean hasGuitarSolo() {
        return guitarSolo;
    }

    @Override
    public String toString() {
        return super.toString() + ", гитарное соло: " + (guitarSolo ? "есть" : "нет");
    }
}
