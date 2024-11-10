package homework_42;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 10-11-2024
 */
import java.util.HashMap;
import java.util.Map;

public class WordLengthCounter {

    /**
     * Task 2
     * Подсчет слов по длине
     * Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).
     * Инструкции:
     * Используйте HashMap<Integer, Integer>, где ключом является длина слова, а значением — количество слов этой длины.
     * Прочитайте текст и обновите карту соответствующим образом.
     * Выведите результаты подсчета.
     * *
     * Метод для подсчета количества слов определенной длины в тексте
     * @param text Входной текст для подсчета слов по длине
     * @return HashMap, где ключ — длина слова, а значение — количество слов этой длины
     */
    public static Map<Integer, Integer> countWordsByLength(String text) {
        // Проверка на пустую строку
        if (text == null || text.isEmpty()) {
            return new HashMap<>();
        }

        // Разделяем текст на слова
        String[] words = text.split("[^a-zA-Zа-яА-Я]+");

        // Создаем карту для хранения длины слов
        Map<Integer, Integer> wordLengthMap = new HashMap<>();

        // считаем слова
        for (String word : words) {
            int length = word.length();

            if (length > 0) { //  не учитываем пустые строки
                wordLengthMap.put(
                        length, wordLengthMap.getOrDefault(
                                length, 0) + 1);
            }
        }

        return wordLengthMap;

    }

    public static void main(String[] args){

        String text = "Java — как стихотворный ритм, где строки кода сплетаются в гармонию, " +
                "раскрывая безграничные возможности в танце логики и цифровых мыслей.";
        Map<Integer, Integer> result = countWordsByLength(text);
        System.out.println("Количество слов по длине:");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Длина " + entry.getKey() + ": " + entry.getValue() + " слов(а)");
        }
    }



}
