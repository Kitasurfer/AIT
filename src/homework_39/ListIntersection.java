package homework_39;

import java.util.ArrayList;
import java.util.List;

/// Group: 52-1, "AIT Hi-tech team" GMBH
/// Author: Bogdan Fesenko
/// Date: 05-11-2024
/**
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */
public class ListIntersection {
    public static <T>List<T> getComIntersection(List<T> list1, List<T> list2) {
        List<T> comIntersection = new ArrayList<>(list1); //Копируем all list1
        comIntersection.retainAll(list2);// Оставляем которые совпадают с list2
        return comIntersection;

    }

    public static void main(String[] args) {
        List<String> list1 = List.of("a1", "a2", "a3", "a4", "a5", "a6");
        List<String> list2 = List.of("a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "a9");

        List<String> result = getComIntersection(list1, list2);
        System.out.printf("Общие (%d): %s%n", result.size(), result);
    }


}
