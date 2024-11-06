package homework_40;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 06-11-2024
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в
порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task_1 {
    public static void test() {
        String testStr = "Изучайте Java - это принесет много пользы!";

        // Удаляем все символы, кроме букв и цифр, замена их на пробелы
        String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я]", " ");
        System.out.println("Поле после очистки: " + newString);

        // Разделяем строки на слова и преобразовываем в массив
        String[] words = newString.split("\\s+");
        System.out.println("Массив слов: " + Arrays.toString(words));

        // Преобразовываем массив в список
        List<String>list = Arrays.asList(words);
        // Удаляем дубликаты и сортируем по длине слов (в алфовитном порядке если длины равны)
        List<String> uniqueSortedWords = list.stream()
                .filter(word -> !word.isEmpty())
                .distinct() //Удаление дубликатов
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())) //Сортируем
                .collect(Collectors.toList());

        System.out.println("Отсортированные слова: " + uniqueSortedWords);
    }
    public static void main(String[] args) {
        test();
    }


}
