package homework_41;

import java.util.HashMap;
import java.util.Map;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 07-11-2024
 */
/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
public class WordFrequency {
    public static void main(String[] args) {
        String text = "I love you, Java, Java world language";

        Map<String, Integer> frequenMap = getWorldFrequency(text);
        for(Map.Entry<String, Integer> entry : frequenMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(STR."\{key} - \{value}");
        }
    }

    private static Map<String, Integer> getWorldFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String updated = text.replace(",", "").toLowerCase();
        String[] words = updated.split(" ");
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.compute(word, (k, value) -> value + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        return wordFrequency;
    }
}
