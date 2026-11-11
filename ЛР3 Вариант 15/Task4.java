import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Лабораторная работа № 3, вариант 15.
 * Задание 4, пункт 15: дана строка 'a!a a@a a#a a$a a%a'.
 * Найти и вывести строки, где по краям стоит 'a',
 * а между ними — один специальный символ (не буква и не цифра).
 * Используются: классы Pattern и Matcher, регулярные выражения.
 */
public class Task4 {

    public static void main(String[] args) {
        String text = "a!a a@a a#a a$a a%a";

        // a, затем один символ, не являющийся буквой, цифрой или пробелом, затем a
        Pattern pattern = Pattern.compile("a[^\\w\\s]a");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Строка: " + text);
        System.out.println("Найденные совпадения:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
