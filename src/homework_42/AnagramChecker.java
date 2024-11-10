package homework_42;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 10-11-2024
 */
/**
 * Task 1
 * Напишите программу, которая проверяет, являются ли две заданные строки анаграммами
 * (то есть содержат ли они одинаковые буквы в разном порядке).
 * <p>
 * Инструкции:
 * Используйте HashMap<Character, Integer> для подсчета количества каждого символа в строках.
 * Сравните две карты, чтобы определить, являются ли строки анаграммами.
 * P.S.
 * Метод equals() для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение —
 * независимо от порядка ключей.
 * Это означает, что если две карты содержат одинаковые пары ключ-значение, то метод equals() вернет true,
 * даже если порядок добавления или хранения этих пар различается.
 * Анаграммы — это слова или фразы, составленные из одних и тех же букв в разном порядке. То есть,
 * две строки являются анаграммами, если они содержат одинаковые символы с одинаковой частотой.
 * <p>
 * Пример:
 * “listen” и “silent” — анаграммы.
 * “triangle” и “integral” — анаграммы.
 * “apple” и “papel” — анаграммы.
 * “hello” и “billion” — не анаграммы.
 */

import java.util.HashMap;

public class AnagramChecker {
    /**
     * Метод проверяет, являются ли две строки анаграммами.
     * @param str1 Первая строка для проверки
     * @param str2 Вторая строка для проверки
     * @return true, если строки являются анаграммами, иначе false
     */

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Заполняем первую карту из первой строки
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        // Заполняем вторую карту кол-вом символов из второй строки
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Сравниваем карты
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "billion";

        if (areAnagrams(str1, str2)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }

    }


}
