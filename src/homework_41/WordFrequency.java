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
        String text = "I love you, Java. You are the language that opens doors to a world of possibilities. " +
                "From creating robust applications to powering complex systems, Java stands as a universal language " +
                "in the tech world. The Java community is vast, and its ecosystem is rich, providing tools and " +
                "frameworks that enable developers to bring their ideas to life. Java is not just a programming" +
                " language; it's a bridge to innovation and a cornerstone of modern technology. " +
                "Thank you, Java, for being the language that unites developers worldwide in a shared passion " +
                "for coding and creativity.";

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
