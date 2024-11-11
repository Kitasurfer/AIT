package lesson_43;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */
/*

 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAndExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 18, 7, 22, 6);
        List<Integer> result = filter(numbers, num -> num % 2 == 0 && num > 10);

        System.out.println("Четные числа больше 10: " + result); // Вывод: Четные числа больше 10: [12, 18, 22]
    }

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
