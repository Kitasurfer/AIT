package lesson_41;

import java.util.Map;
import java.util.TreeMap;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 07-11-2024
 */

public class TreeMapExample {

    public static void main(String[] args) {
        // Создаем экземпляр TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Добавляем элементы
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 8);
        treeMap.put("Orange", 7);
        treeMap.put("Water", 9);
        treeMap.put("Pineapple", 1);

        // Получаем значение по ключу
        System.out.println("Количество бананов: " + treeMap.get("Banana"));

        // Проходим по всем элементам с использованием цикла for-each
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Удаляем элемент
        treeMap.remove("Apple");

        // Пример использования fuzzyContainsKey с учетом регистра и опечаток
        String searchKey1 = "aple"; // пример с опечаткой
        String searchKey2 = "pineapple"; // правильное написание
        String searchKey3 = "Pineaple"; // пример с одной опечаткой

        System.out.println("Найден ли ключ 'aple'? " + fuzzyContainsKey(treeMap, searchKey1, 1));
        System.out.println("Найден ли ключ 'pineapple'? " + fuzzyContainsKey(treeMap, searchKey2, 1));
        System.out.println("Найден ли ключ 'Pineaple'? " + fuzzyContainsKey(treeMap, searchKey3, 1));
        System.out.println("Найден ли ключ 'Water'? " + fuzzyContainsKey(treeMap, searchKey3, 1));
        System.out.println("Найден ли ключ 'Watter'? " + fuzzyContainsKey(treeMap, searchKey3, 1));
    }

    /**
     * Метод для "fuzzy" поиска ключа в карте. Проверяет наличие ключа без учета регистра и с учетом допустимого
     * количества ошибок (расстояние Левенштейна).
     *
     * @param map           карта, в которой выполняется поиск
     * @param key           искомый ключ
     * @param maxDistance   максимально допустимое расстояние Левенштейна для совпадения
     * @return true, если ключ найден с учетом допустимых ошибок, иначе false
     */
    public static boolean fuzzyContainsKey(Map<String, Integer> map, String key, int maxDistance) {
        return map.keySet().stream()
                .anyMatch(existingKey -> levenshteinDistance(existingKey.toLowerCase(), key.toLowerCase()) <= maxDistance);
    }

    /**
     * Вычисляет расстояние Левенштейна между двумя строками.
     *
     * @param s1 первая строка
     * @param s2 вторая строка
     * @return расстояние Левенштейна между s1 и s2
     */
    private static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1;
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, // удаление
                            Math.min(dp[i][j - 1] + 1, // вставка
                                    dp[i - 1][j - 1] + cost)); // замена
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
