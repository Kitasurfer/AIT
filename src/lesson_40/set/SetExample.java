package lesson_40.set;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 06-11-2024
 *
 * Класс SetExample демонстрирует работу с HashSet, LinkedHashSet и TreeSet, а также принципы использования
 * hashCode() и equals() для корректной работы хэш-коллекций.
 */
public class SetExample {

    /*
     Контракт между equals() и hashCode():
     Для корректной работы hash-коллекций необходимо соблюдать следующие условия:

     1. Если два объекта равны по методу equals(), то их hash-коды должны быть равны.
        // Если equals() возвращает true для двух объектов, то их hashCode() также должен быть одинаковым.

     2. Если хеш-коды двух объектов различны, то объекты точно не равны по equals().
        // Если hashCode() у двух объектов разный, то метод equals() должен возвращать false.

     3. Вызов метода hashCode() должен возвращать одинаковое значение при многократном вызове на неизменённом объекте.
        // Значение hashCode() для одного и того же объекта не должно изменяться, если объект не был изменён.
     */

    public static void main(String[] args) {
        // Инициализация различных Set для демонстрации их работы

        // Создание пустого HashSet с начальной ёмкостью 16 и коэффициентом загрузки 0,75
        Set<Integer> set = new HashSet<>();

        // Создание пустого HashSet с заданной ёмкостью 20
        set = new HashSet<>(20);

        // Создание HashSet с элементами из другой коллекции
        set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 6, 5, 3)); // Дубликаты будут удалены

        // Выводим размер и элементы множества HashSet
        System.out.println("=== HashSet ===");
        System.out.printf("Размер множества: %d%nЭлементы множества: %s%n%n", set.size(), set);

        // Инициализация списка с повторяющимися значениями
        List<Integer> startValues = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 6, 5, 16, 32));

        // Выводим размер и элементы начального списка
        System.out.println("=== Начальный список ===");
        System.out.printf("Размер списка: %d%nЭлементы списка: %s%n%n", startValues.size(), startValues);

        // Создание TreeSet по умолчанию - естественный порядок (возрастающий)
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.addAll(startValues); // Добавляем элементы из startValues
        System.out.println("=== TreeSet с естественным порядком ===");
        System.out.printf("Элементы TreeSet: %s%n%n", sortedSet);

        // Создание TreeSet из коллекции с естественным порядком
        sortedSet = new TreeSet<>(startValues); // Добавляем все элементы из startValues при создании
        System.out.println("=== TreeSet из коллекции с естественным порядком ===");
        System.out.printf("Элементы TreeSet: %s%n%n", sortedSet);

        // Создание TreeSet с компаратором, определяющим обратный порядок сортировки
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(startValues);
        System.out.println("=== TreeSet с обратным порядком сортировки ===");
        System.out.printf("Элементы TreeSet: %s%n%n", treeSet);

        // Пример использования first() и last()
        System.out.println("\n=== Методы first() и last() ===");
        treeSet.add(10); // Добавление элемента для примера
        System.out.printf("Первый элемент TreeSet: %s%n", treeSet.first());
        System.out.printf("Последний элемент TreeSet: %s%n%n", treeSet.last());

        // Пример использования headSet()
        System.out.println("=== Метод headSet() ===");
        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.printf("Элементы TreeSet: %s%n", integerSortedSet);
        System.out.printf("Элементы меньше 8: %s%n", integerSortedSet.headSet(8)); // Элементы меньше 8

        // Пример использования tailSet()
        System.out.println("\n=== Метод tailSet() ===");
        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8); // Элементы >= 8
        System.out.printf("Элементы больше или равны 8: %s%n%n", tailSet);

        // Пример использования subSet()
        System.out.println("=== Метод subSet() ===");
        // Элементы в диапазоне от 3 (включительно) до 16 (не включительно)
        SortedSet<Integer> subSet = integerSortedSet.subSet(3, 16);
        System.out.printf("Элементы от 3 включительно до 16 не включительно: %s%n", subSet);

        // Comparator() - Возвращает компаратор, используемый для упорядочивания элементов в этом множестве
        // вернется null если используется естественный порядок сортировки
        System.out.println("\n=== Используемый компаратор ===");
        System.out.printf("Компаратор для integerSortedSet (естественный порядок): %s%n", integerSortedSet.comparator());
        System.out.printf("Компаратор для treeSet (обратный порядок): %s%n", treeSet.comparator());
    }

    /**
     * Метод для получения списка уникальных элементов.
     *
     * @param list исходный список, который может содержать повторяющиеся значения
     * @param <T> тип элементов в списке
     * @return новый список, содержащий только уникальные элементы из исходного списка
     */
    public static <T> List<T> getUniqueList(List<T> list) {
        // Создание LinkedHashSet для сохранения только уникальных элементов
        // и сохранения порядка их появления в исходном списке
        Set<T> set = new LinkedHashSet<>(list);

        // Возвращаем новый список, содержащий все элементы set-а
        return new ArrayList<>(set);
    }




    public class StringUtil {

        public static void test() {
            String testStr = "Тестовая строка, со словами!";

            // Удаление всех символов, кроме букв и цифр, замена их на пробелы
            String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я]", " ");
            System.out.println("После очистки: " + newString);

            // Разделение строки на слова и преобразование в массив
            String[] words = newString.split("\\s+");
            System.out.println("Массив слов: " + Arrays.toString(words));

            // Преобразование массива в список
            List<String> list = Arrays.asList(words);

            // Удаление дубликатов и сортировка по длине слов (и в алфавитном порядке, если длины равны)
            List<String> uniqueSortedWords = list.stream()
                    .filter(word -> !word.isEmpty()) // Фильтрация пустых строк
                    .distinct() // Удаление дубликатов
                    .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())) // Сортировка
                    .collect(Collectors.toList());

            System.out.println("Уникальные отсортированные слова: " + uniqueSortedWords);
        }

        public static void main(String[] args) {
            test();
        }
    }


}
