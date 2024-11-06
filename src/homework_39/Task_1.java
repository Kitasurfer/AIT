package homework_39;

import java.util.ArrayList;
import java.util.List;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 06-11-2024
 *
 * Класс Task_1 демонстрирует нахождение пересечения двух списков.
 */
public class Task_1 {
    public static void main(String[] args) {
        // Создание двух списков целых чисел для демонстрации пересечения
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5, 6, 7));
        List<Integer> integers1 = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5, 6, 7, 8, 9));

        // Создание двух списков строк для демонстрации пересечения
        List<String> strings = new ArrayList<>(List.of("a", "b", "c", "a"));
        List<String> strings1 = new ArrayList<>(List.of("a", "c", "d", "c"));

        // Вывод пересечения двух списков целых чисел
        System.out.println("Пересечение двух списков целых чисел: " + intersection(integers, integers1));
        System.out.println("Пересечение одного списка целых чисел с самим собой: " + intersection(integers, integers));

        // Вывод пересечения двух списков строк
        System.out.println("Пересечение двух списков строк: " + intersectionGen(strings, strings1));
        System.out.println("Пересечение одного списка строк с самим собой: " + intersectionGen(strings, strings));
    }

    /**
     * Метод для нахождения пересечения двух списков с использованием обобщений.
     *
     * @param list1 первый список
     * @param list2 второй список
     * @param <T> тип элементов в списках
     * @return список, содержащий элементы, которые есть в обоих списках
     */
    public static <T> List<T> intersectionGen(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1); // Создаём новый список с элементами из первого списка
        result.retainAll(list2); // Оставляем только элементы, которые есть во втором списке
        return result;
    }

    /**
     * Метод для нахождения пересечения двух списков целых чисел.
     *
     * @param a первый список
     * @param b второй список
     * @return список, содержащий элементы, которые есть в обоих списках
     */
    public static List<Integer> intersection(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(a); // Создаём новый список с элементами из первого списка
        result.retainAll(b); // Оставляем только элементы, которые есть во втором списке
        return result;
    }
}
