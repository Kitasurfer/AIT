package lesson_11; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 24-09-2024
*/

import java.util.Arrays;

public class DZ_10_2 {
    public static void main(String[] args) {

        // Тестовые массивы для проверки крайних случаев
        String[] testArray1 = {null, "apple", "banana", "kiwi", "strawberry", "pear", null}; // массив с null и строками
        String[] testArray2 = {}; // пустой массив
        String[] testArray3 = {null, null, null}; // массив, содержащий только null
        String[] testArray4 = {"one"}; // массив с одной строкой
        String[] testArray5 = {"apple", "banana", "pear"}; // массив без null
        String[] testArray6 = null; // сам массив равен null

        // Тесты всех массивов
        System.out.println("Тест 1:");
        testFindShortestAndLongestStrings(testArray1);
        System.out.println("\nТест 2:");
        testFindShortestAndLongestStrings(testArray2);
        System.out.println("\nТест 3:");
        testFindShortestAndLongestStrings(testArray3);
        System.out.println("\nТест 4:");
        testFindShortestAndLongestStrings(testArray4);
        System.out.println("\nТест 5:");
        testFindShortestAndLongestStrings(testArray5);
        System.out.println("\nТест 6:");
        testFindShortestAndLongestStrings(testArray6);
    }

    // Метод для тестирования с выводом
    public static void testFindShortestAndLongestStrings(String[] array) {
        String[] result = findShortestAndLongestStrings(array);
        System.out.println("Самая короткая строка: " + (result[0].isEmpty() ? "Пусто" : result[0]));
        System.out.println("Самая длинная строка: " + (result[1].isEmpty() ? "Пусто" : result[1]));
    }

    // Метод для поиска самой короткой и самой длинной строки в массиве
    public static String[] findShortestAndLongestStrings(String[] array) {
        // Проверяем, что массив не пустой и не равен null
        if (array == null || array.length == 0) {
            return new String[]{"", ""}; // Возвращаем пустые строки, если входной массив null или пуст
        }

        // Инициализация переменных для самой короткой и самой длинной строки
        String shortest = null;
        String longest = null;
        String find = null;

        // Проходим по массиву строк
        for (String str : array) {
            // Пропускаем элементы, которые равны null
            if (str == null) {
                continue;
            }

            // Если самая короткая строка не установлена или текущая строка короче
            if (shortest == null || str.length() < shortest.length()) {
                shortest = str;
            }

            // Если самая длинная строка не установлена или текущая строка длиннее
            if (longest == null || str.length() > longest.length()) {
                longest = str;
            }
        }

        // Если массив содержал только null, то возвращаем пустые строки
        if (shortest == null) {
            shortest = "";
        }
        if (longest == null) {
            longest = "";
        }

        // Возвращаем массив, содержащий самую короткую и самую длинную строки
        return new String[]{shortest, longest};
    }
    public static String find(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }
        return null;
    }
}
