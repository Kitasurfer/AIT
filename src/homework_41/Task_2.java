package homework_41;

import java.util.HashMap;
import java.util.Map;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 08-11-2024
 */

public class Task_2 {

    public static Map<String, Integer> countWords(String text) {
        // Создаю массив слов
        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        // Создаю пустую карту для хранения слов и их количества
        Map<String, Integer> result = new HashMap<>();

        // Перебираю слова
        for (String word : words) {
            // Пытаюсь получить значение, ассоциированное с текущим словом
            Integer amount = result.get(word);

            // Если значения не было — присваиваю 0
            if (amount == null) {
                amount = 0;
            }

            // Увеличиваю amount на 1
            amount = amount + 1;

            // Перезаписываю или записываю новую пару ключ-значение
            result.put(word, amount);
        }

        // Возвращаю результат
        return result;
    }

    public static void main(String[] args) {
        String text = "'\n" +
                "Строка для проверки количества вхождений слов\" +\n" +
                "\n Строка для проверки и теста. и количества слов для проверки\n";
        Map<String, Integer> wordCount = countWords(text);
        System.out.println(wordCount);
    }
}
