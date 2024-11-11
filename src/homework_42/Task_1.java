package homework_42;

import java.util.HashMap;
import java.util.Map;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */
public class Task_1 {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> countMap1 = charCountMap(str1);
        Map<Character, Integer> countMap2 = charCountMap(str2);

        return countMap1.equals(countMap2);
    }

    private static Map<Character, Integer> charCountMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
