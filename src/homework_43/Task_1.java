package homework_43;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 1
 * Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
 * В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
 * четные, больше 10 и меньше 100
 * Для фильтрации используйте Stream API
 */
public class Task_1 {

    public static void main(String[] args) {
        // Define an array of integers
        int[] array = new int[]{2, 150, 3, 50, 200};

        // Print the filtered list of integers
        System.out.println(filter(array));
    }

    // Method to filter numbers that are even, greater than 10, and less than 100
    public static List<Integer> filter(int[] array) {
        return Arrays.stream(array)
                .filter(num -> num % 2 == 0 && num > 10 && num < 100) // Фильтрация чисел по условиям
                .boxed() // Convert int to Integer
                .collect(Collectors.toList()); // Collect results into a list
    }
}
