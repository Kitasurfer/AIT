package homework_41;

import java.util.HashMap;
import java.util.Map;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 08-11-2024
 */

public class Task_2_2 {

    public static Map<String, Integer> countWords(String text) {
        // Создаю пустую карту для хранения слов и их количества
        Map<String, Integer> result = new HashMap<>();

        // Перебираю слова и обновляю количество вхождений с помощью merge
        for (String word : text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+")) {
            result.merge(word, 1, Integer::sum);
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "I love Java, Java is the world language!";
        Map<String, Integer> wordCount = countWords(text);
        System.out.println(wordCount);
    }
}
