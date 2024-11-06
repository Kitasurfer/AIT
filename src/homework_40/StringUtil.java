package homework_40;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 06-11-2024
 */
/*

 */
import java.util.*;
import java.util.stream.Collectors;

public class StringUtil {

    public static void test() {
        String testStr = "Тестовая строка, со словами!";

        // Удаление всех символов, кроме букв и цифр, замена их на пробелы
        String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я]", " ");
        System.out.println("После очистки: " + newString);

        // Разделение строки на слова и преобразование в массив
        String[] words = newString.split("\\s+");
        System.out.println("Массив слов: " + Arrays.toString(words));

        // Преобразование массива в список
        List<String> list = Arrays.asList(words);

        // Удаление дубликатов и сортировка по длине слов (и в алфавитном порядке, если длины равны)
        List<String> uniqueSortedWords = list.stream()
                .filter(word -> !word.isEmpty()) // Фильтрация пустых строк
                .distinct() // Удаление дубликатов
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())) // Сортировка
                .collect(Collectors.toList());

        System.out.println("Уникальные отсортированные слова: " + uniqueSortedWords);
    }

    public static void main(String[] args) {
        test();
    }
}
