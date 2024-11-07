package homework_40;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 06-11-2024
 */

/**
 * Task 2
 * Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
 * Некоторые слова должны повторяться в обоих множествах.
 * Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
 * содержащее все уникальные элементы из обоих множеств (объединение множеств).
 *
 * Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество,
 * содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
 *
 * Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов,
 * которые есть в первом множестве, но отсутствуют во втором (разность множеств).
 */
public class Task_2 {
    /**
     * Метод для объединения двух множеств.
     * Возвращает множество, содержащее все уникальные элементы из обоих множеств.
     *
     * @param set1 первое множество
     * @param set2 второе множество
     * @return объединенное множество
     */
    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    /**
     * Метод для пересечения двух множеств.
     * Возвращает множество, содержащее только общие элементы из обоих множеств.
     *
     * @param set1 первое множество
     * @param set2 второе множество
     * @return пересечение множеств
     */
    private static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    /**
     * Метод для разности двух множеств.
     * Возвращает элементы, которые находятся в первом множестве, но отсутствуют во втором.
     *
     * @param set1 первое множество
     * @param set2 второе множество
     * @return разность множеств
     */
    private static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.printf("Объединение множеств: %s%n", union(set1, set2));
        System.out.printf("Пересечение множеств: %s%n", intersection(set1, set2));
        System.out.printf("Разность множеств (set1 - set2): %s%n", difference(set1, set2));
    }
}
