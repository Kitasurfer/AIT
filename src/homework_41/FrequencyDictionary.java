package homework_41;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 07-11-2024
 */
/**
Task2
Опционально:
Напишите метод, возвращающий частотный словарь вхождения символов в строку
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
Copy
//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1

Вхождение символов:
'
': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8; 'й': 1; 'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5; 'т': 6; 'х': 1; 'ч': 2; 'я': 3;
 */
import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();

    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (result.containsKey(text.charAt(i))) {
                result.compute(text.charAt(i), (k, value) -> value + 1);
            } else {
                result.put(text.charAt(i), 1);
            }
        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        String updated = text.replace(",","").replace(".","");
        String[] array = updated.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String world = array[i];
            if (result.containsKey(world)) {
                result.put(world, result.get(world) + 1);
            } else {
                result.put(world, 1);
            }
        }
        return result;
    }

}
