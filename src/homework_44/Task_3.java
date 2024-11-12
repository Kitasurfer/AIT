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
 * Task 3
 * Имеется список целых чисел.
 * Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
 * и собрать результат в новый список
 */
public class Task_3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println("Изначальный список чисел:" + numbers);

        // Фильтруем четные, умножаем на 2, и выводим новый список
        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)// Оставляем четные
                .map(num -> num * 2)// умножаем на 2
                .collect(Collectors.toList()); // собираем в новый список


        System.out.println("Новый список" + result);

    }


}
