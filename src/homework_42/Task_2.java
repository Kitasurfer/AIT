package homework_42;

import java.util.HashMap;
import java.util.Map;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */
public class Task_2 {
    public static void main(String[] args) {
        String text = "Java — как стихотворный ритм, где строки кода сплетаются в гармонию, \" +\n" +
                "                \"раскрывая безграничные возможности в танце логики и цифровых мыслей.";
        Map<Integer, Integer> wordLengths = countWordLengths(text);

        System.out.println("Длины слов и их частота: " + wordLengths);
    }

    public static Map<Integer, Integer> countWordLengths(String text) {
        Map<Integer, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^\\p{L}\\s]", "");

        String[] words = text.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                int length = word.length();
                map.merge(length, 1, Integer::sum);
            }
        }
        return map;
    }
}
