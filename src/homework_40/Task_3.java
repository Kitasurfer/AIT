package homework_40;

/// Group: 52-1, "AIT Hi-tech team" GMBH
/// Author: Bogdan Fesenko
/// Date: 06-11-2024
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Метод возвращает первый неповторяющийся символ в строке. LinkedHashMap
 *
 * @param str входная строка
 * @return первый уникальный символ или '\0' если такого нет
 */
public class Task_3 {
    public static char getFirstLetter(String str) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        // Заполняем карту символов
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        // Ищем первый символ с частовтой 1
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; //Если уникальных нет

    }

    public static void main(String[] args) {
        String str = "abcdefj ab,cdef,";

        System.out.printf("Первый уникальный символ (LinkedHashMap): %s%n",  getFirstLetter(str));

    }


}
