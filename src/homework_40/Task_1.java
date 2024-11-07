package homework_40;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 06-11-2024
 */

public class Task_1 {

    /**
     * Метод принимает строку и возвращает список уникальных слов, отсортированных по длине.
     *
     * @param input строка для обработки
     * @return отсортированный список уникальных слов
     */
    public static List<String> getUniqueSortedWords(String input) {
        // Удаляем все символы, кроме букв и цифр, заменяя их на пробелы
        String cleanedString = input.replaceAll("[^a-zA-Z0-9а-яА-Я]", " ");
        System.out.println("Строка после очистки: " + cleanedString);

        // Разделяем строки на слова, удаляем дубликаты и сортируем
        List<String> uniqueSortedWords = Arrays.stream(cleanedString.split("\\s+"))
                .filter(word -> !word.isEmpty()) // Убираем пустые строки
                .distinct() // Удаляем дубликаты
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())) // Сортируем по длине и алфавиту
                .collect(Collectors.toList());

        return uniqueSortedWords;
    }

    public static void main(String[] args) {
        String testStr = "Изучайте Java - это принесет много пользы! В Java много функционала.";
        System.out.println("Отсортированные уникальные слова: " + getUniqueSortedWords(testStr));
    }
}
