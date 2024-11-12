package homework_44;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 12-11-2024
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Task 2
 * Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */
public class Task_2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("kite", "windsurfing", "kiteboarding", "spot", "wind", "haricane");
        System.out.println("Изначальный список слов: " + words);

        // Находим первое слово с минимальной длинной
        Optional<String> firstShortText = words.stream()
                .min((w1, w2) -> Integer.compare(w1.length(), w2.length()));
        firstShortText.ifPresent(w -> System.out.println(w));
        // Метод min возвращает первую строку с минимальной длиной
    }
}
