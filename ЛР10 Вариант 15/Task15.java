/**
 * Лабораторная работа № 10, вариант 15.
 * Задание 15: 3 стола и 2 стула — собрать и использовать.
 * Массив интерфейсного типа Usable[], полиморфные вызовы.
 */
public class Task15 {

    public static void main(String[] args) {
        Usable[] items = new Usable[5];
        items[0] = new Table("Обеденный", "дуб", 4);
        items[1] = new Table("Письменный", "ЛДСП", 4);
        items[2] = new Table("Журнальный", "стекло", 3);
        items[3] = new Chair("Офисный", "текстиль", true);
        items[4] = new Chair("Деревянный", "берёза", false);

        // статический метод интерфейса вызывается по имени интерфейса
        System.out.println(Usable.contractInfo());
        System.out.println();

        // полиморфный вызов методов интерфейса Usable
        System.out.println("=== Использование (Usable) ===");
        for (Usable u : items) {
            u.use();
            System.out.println("Назначение: " + u.getPurpose());
        }

        System.out.println();
        System.out.println("=== Сборка и разборка (Assemblable) ===");
        for (Usable u : items) {
            if (u instanceof Assemblable) {
                ((Assemblable) u).assemble();
                ((Assemblable) u).disassemble();
            }
        }

        // доступ к собственным полям через приведение типа
        System.out.println();
        System.out.println("=== Параметры ===");
        for (Usable u : items) {
            if (u instanceof Table) {
                Table t = (Table) u;
                System.out.println("Стол \"" + t.getName() + "\": материал "
                        + t.getMaterial() + ", ножек: " + t.getLegs());
            } else if (u instanceof Chair) {
                Chair c = (Chair) u;
                System.out.println("Стул \"" + c.getName() + "\": материал "
                        + c.getMaterial() + ", спинка: " + (c.hasBackrest() ? "есть" : "нет"));
            }
        }
    }
}
