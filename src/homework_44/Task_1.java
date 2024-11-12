package homework_44;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 12-11-2024
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 1
 * Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения
 * по значению последней цифры в числе и выведите результат на экране
 */
public class Task_1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(14, 15, 91, 88, 54, 33, 89, 74, 32, 82, 4, 7);

        System.out.println("Изначальный список номеров: " + numbers);

        List<Integer> result = numbers.stream()
                .filter(num -> num > 10)
                .sorted((a, b) -> Integer.compare(a % 10, b % 10))
                .collect(Collectors.toList());

        System.out.println("Отсортированы по значению последней цифры в числе: " + result);

    }


}
