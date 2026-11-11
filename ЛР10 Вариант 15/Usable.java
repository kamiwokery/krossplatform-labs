/**
 * Задание 15: интерфейс "Usable" (используемая мебель).
 * Абстрактные методы use() и getPurpose().
 * Статический метод (Java 8+) — опциональная демонстрация.
 */
public interface Usable {

    void use();

    String getPurpose();

    // статический метод интерфейса — вызывается только по имени интерфейса
    static String contractInfo() {
        return "Интерфейс Usable: контракт назначения предмета мебели";
    }
}
