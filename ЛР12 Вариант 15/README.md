# Лабораторная работа № 12 — Вариант 15

**Тема:** Разработка, отладка и испытание программ с использованием обобщённых типов и коллекций значений
**Дисциплина:** Основы кроссплатформенного программирования
**Среда разработки:** IntelliJ IDEA
**Время выполнения:** 6 часов

## Задания варианта 15

### Задание 1, п. 15 — Музыка

`Map<String, Music>` с названием как ключом: 3 `Rock`, 3 `Classical`, 2 `Jazz`, вывод всех ключей и значений.

| Файл | Назначение |
|------|------------|
| `Music.java` | базовый класс: `title`, `id`, `duration` |
| `Rock.java` | наследник: `guitarSolo` |
| `Classical.java` | наследник: `orchestra` |
| `Jazz.java` | наследник: `improvisation` |
| `Task1.java` | `LinkedHashMap<String, Music>`, вывод ключей и значений |

### Задание 2, п. 15 — Курсы

Класс `Course` (`id`, `title`, `category`, `rating`, `studentRatings` — `List<Integer>`), методы `getAverageRating()`, `getRating()`, `setRating()`.

Операции:
1. удалить курсы со средним рейтингом < 3;
2. повысить рейтинг курсов со средним рейтингом ≥ 4;
3. `printCourses(List<Course> courses, int rating)` — печать курсов с рейтингом;
4. упорядочить по убыванию среднего балла, при совпадении — по алфавиту названия; вывести ID, название и средний рейтинг.

| Файл | Назначение |
|------|------------|
| `Course.java` | класс с `List<Integer>` оценок и вычисляемым средним |
| `Task2.java` | операции над `ArrayList<Course>`: `removeIf`, цикл, `sort` с `Comparator` |

## Как открыть и запустить в IntelliJ IDEA

1. Запустите IntelliJ IDEA.
2. `File` → `Open...` → выберите папку `ЛР12 Вариант 15` на рабочем столе → `OK` (Trust Project).
3. Укажите JDK в поле `Project SDK`.
4. Откройте `Task1.java` или `Task2.java` → зелёный треугольник → `Run`.

## Контрольные вопросы (ответы)

1. **Основные интерфейсы коллекций:** `Collection<E>` (вершина иерархии `List`, `Set`, `Queue`, наследует `Iterable<E>`) и `Map<K,V>` (отображение «ключ–значение», не входит в `Collection`).
2. **List и Set:** `List` — упорядоченная коллекция, допускает дубликаты, доступ по индексу. `Set` — множество уникальных элементов, дубликаты запрещены.
3. **ArrayList и LinkedList:** `ArrayList` на базе массива — быстрый доступ по индексу O(1), вставка/удаление в середине дороже. `LinkedList` — связный список: быстрые вставки/удаления рядом с уже найденным узлом, доступ по индексу O(n); дополнительно реализует `Deque` (используется как стек/очередь).
4. **HashSet и TreeSet:** `HashSet` — хеш-таблица: порядок не гарантирован, операции O(1). `TreeSet` — дерево: элементы отсортированы (по умолчанию по возрастанию), O(log n), поддерживает `headSet/tailSet`.
5. **HashMap и TreeMap:** `HashMap` — ключи распределяются по хешу, порядок не гарантирован, O(1). `TreeMap` — ключи отсортированы (красно-чёрное дерево), O(log n), есть `firstKey/lastKey`.
6. **Как перебрать элементы:** цикл for-each (через `Iterable`), итератор `Iterator` (`hasNext()`/`next()`), `forEach`, индексный цикл по `List`, метод `keySet()/values()/entrySet()` у `Map`, стримы `stream()`.
7. **Iterator:** объект последовательного доступа к элементам коллекции (`Iterator<E>`): `hasNext()` — есть ли следующий, `next()` — вернуть и перейти, `remove()` — удалить текущий. Позволяет удалять элементы во время обхода без `ConcurrentModificationException`.
8. **Сортировка коллекции:** `list.sort(comparator)`, `Collections.sort(list)`, компараторы `Comparator.comparing(...)`, `.reversed()`, `.thenComparing(...)`; для `Set` — `new TreeSet<>(set)` или сортировка через `TreeMap`/`stream().sorted().toList()`.

## Теория в коде

- `Map<String, Music>`, `LinkedHashMap` — generics в действии, `keySet()`, `values()`, `entrySet()`, `get(key)`.
- `List<Integer> studentRatings` — обобщённая коллекция внутри класса.
- `removeIf`, `sort` + `Comparator.comparingDouble().reversed().thenComparing()` — операции над коллекциями.
