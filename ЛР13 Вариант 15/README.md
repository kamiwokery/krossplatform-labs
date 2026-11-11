# Лабораторная работа № 13 — Вариант 15

**Тема:** Разработка, отладка и испытание программ с использованием обработки исключительных ситуаций
**Дисциплина:** Основы кроссплатформенного программирования
**Среда разработки:** IntelliJ IDEA
**Время выполнения:** 4 часа

## Задание варианта 15 — 15. Курс

Сущность **Course**:
- Поля: `name`, `teacher`, `duration`, `price`, `maxStudents`
- Конструктор с проверкой: длительность > 0, цена >= 0
- Методы: `enroll(String student)` — запись студента, `cancelEnrollment(String student)` — отмена записи

Исключения:
- `InvalidCourseDataException` — неверные данные (конструктор)
- `CourseNotFoundException` — курс не найден (с полем имени курса)
- `EnrollmentException` — ошибка записи (дубликат, нет мест, пустое имя, отмена несуществующей записи)

| Файл | Назначение |
|------|------------|
| `InvalidCourseDataException.java` | checked-исключение, наследует `Exception` |
| `CourseNotFoundException.java` | checked-исключение с полем `courseName` |
| `EnrollmentException.java` | checked-исключение ошибки записи |
| `Course.java` | сущность с валидацией в конструкторе, `ArrayList<String>` записанных студентов |
| `Task15.java` | система курсов (`Map<String, Course>`), все операции в `try-catch`, блок `finally` |

Сценарии в `Task15.java`:
1. создание курса с некорректной длительностью/ценой → `InvalidCourseDataException`;
2. запись студентов (включая переполнение и дубликат) → `EnrollmentException`;
3. поиск несуществующего курса → `CourseNotFoundException`;
4. отмена записи (успешная и для несуществующего студента);
5. блок `finally`.

## Как открыть и запустить в IntelliJ IDEA

1. Запустите IntelliJ IDEA.
2. `File` → `Open...` → выберите папку `ЛР13 Вариант 15` на рабочем столе → `OK` (Trust Project).
3. Укажите JDK в поле `Project SDK`.
4. Откройте `Task15.java` → зелёный треугольник → `Run`.

## Контрольные вопросы (ответы)

1. **Что такое исключение в Java?** Событие, нарушающее нормальный ход выполнения программы (runtime error), объект класса-наследника `Throwable`, возникающий во время выполнения.
2. **Иерархия классов исключений:** `Throwable` → `Error` (системные, не обрабатываются: `OutOfMemoryError`, `StackOverflowError`) и `Exception` → далее `RuntimeException` (unchecked) и проверяемые (`IOException`, `SQLException`).
3. **Checked vs unchecked:** checked проверяются компилятором — нужно обработать (`try-catch`) или пробросить (`throws`); unchecked (`RuntimeException` и наследники: `NullPointerException`, `ArithmeticException`) — не обязательны к обработке.
4. **Ключевые слова обработки:** `try`, `catch`, `finally`, `throw`, `throws`.
5. **try-catch-finally:** `try` — код, где возможно исключение; `catch` — обработка конкретного типа; `finally` — выполняется всегда (даже при `return`/исключении), обычно для освобождения ресурсов.
6. **throw vs throws:** `throw new X(...)` — сгенерировать исключение прямо в коде; `throws X` — объявить в сигнатуре метода, что метод может пробросить исключение вызывающему.
7. **Блок finally:** выполняется в любом исходе — после `try`, после любого `catch`, при `return` из `try`; не выполняется только при `System.exit()`.
8. **Собственное исключение:** создать класс-наследник `Exception` (checked) или `RuntimeException` (unchecked), обычно с конструктором `String message` (`super(message)`) и нужными полями.
9. **try-with-resources:** конструкция `try (Resource r = ...) { }` (Java 7+), ресурсы реализуют `AutoCloseable` и закрываются автоматически даже при исключении.
10. **Обработка нескольких типов:** несколько блоков `catch` подряд; порядок — от специфичного к общему (`ArithmeticException` до `Exception`), иначе ошибка компиляции.
11. **Multi-catch:** `catch (IOException | SQLException e)` — один блок для нескольких типов (Java 7+), переменная `e` неявно `final`.
12. **Ошибка при делении на ноль:** `ArithmeticException: / by zero` (целочисленное деление).
13. **Если не обработать:** исключение поднимается по стеку вызовов до `main`; при отсутствия обработчика — поток завершается, программа падает с выводом stack trace.
14. **Сообщение об ошибке:** `e.getMessage()`, также `e.toString()`, `e.getClass().getName()` и `e.printStackTrace()`.
15. **Stack trace:** трассировка стека вызовов в момент возникновения исключения — последовательность методов от места ошибки до `main`; выводится `printStackTrace()`, помогает отладке.
16. **try-with-resources с несколькими ресурсами:** перечисление через `;` внутри скобок: `try (A a = ...; B b = ...) { }` — закрываются в обратном порядке.

## Теория в коде

- пользовательские checked-исключения (`extends Exception`) с полями;
- `throw` в конструкторе и методах, `throws` в сигнатурах;
- `try-catch` с несколькими типами (`catch (CourseNotFoundException | EnrollmentException e)`);
- блок `finally`;
- информативные сообщения об ошибках.
