package homework_43;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */

/**
 * Task 2
 * Дан список строк.
 * Используйте Stream API для фильтрации строк, которые начинаются на определенную букву (например, "A"),
 * и отсортируйте их в алфавитном порядке.
 * Результат сохраните в новый список строк.
 * Опционально: удалите дубликаты из списка строк.
 */
public class Task_2 {
    public static void main(String[] args) {
        // Initialize a list of strings
        List<String> strings = Arrays.asList("Avokado", "Cat", "Dog", "Avokado", "Apple", "Abibas");

        // Filter, remove duplicates, and sort strings starting with "A"
        List<String> result = sortArray(strings, "A");

        // Print the result
        System.out.println(result);
    }

    // Method to filter, remove duplicates, and sort strings starting with a specified letter
    private static List<String> sortArray(List<String> strings, String letter) {
        return strings.stream()
                .filter(word -> word.startsWith(letter)) // Filter strings starting with the specified letter
                .distinct() // Remove duplicates
                .sorted() // Sort in alphabetical order
                .collect(Collectors.toList()); // Collect results into a list
    }
}
