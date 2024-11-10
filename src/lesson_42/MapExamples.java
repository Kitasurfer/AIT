package lesson_42;

import java.util.*;
import java.util.stream.Collectors;

public class MapExamples {

    public static void main(String[] args) {
        // Пример 1: Использование entrySet() для доступа к парам "ключ-значение"
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("Пример 1: Использование entrySet()");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

        System.out.println("\nПример 2: Использование keySet()");
        // Пример 2: Использование keySet() для доступа ко всем ключам
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("Ключ: " + key);
        }

        System.out.println("\nПример 3: Использование values()");
        // Пример 3: Использование values() для доступа ко всем значениям
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("Значение: " + value);
        }

        System.out.println("\nПример 4: Изменение значений с использованием entrySet()");
        // Пример 4: Изменение значений с использованием entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            entry.setValue("Color: " + entry.getValue());
        }
        System.out.println("Измененные значения: " + map);

        System.out.println("\nПример 5: Использование forEach с entrySet()");
        // Пример 5: Использование forEach с entrySet()
        map.forEach((key, value) -> System.out.println("Ключ: " + key + ", Значение: " + value));

        System.out.println("\nПример 6: Фильтрация значений с использованием entrySet() и Stream API");
        // Пример 6: Фильтрация значений с использованием entrySet() и Stream API
        map.put(4, "Dark Red");
        Map<Integer, String> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getValue().contains("Red"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Отфильтрованные значения: " + filteredMap);

        System.out.println("\nПример 7: Подсчёт количества уникальных значений с использованием values()");
        // Пример 7: Подсчёт количества уникальных значений с использованием values()
        map.put(4, "Red");
        Collection<String> valuesForCount = map.values();
        int uniqueCount = new HashSet<>(valuesForCount).size();
        System.out.println("Количество уникальных значений: " + uniqueCount);

        System.out.println("\nПример 8: Преобразование Map в List ключей или значений");
        // Пример 8: Преобразование Map в List ключей или значений
        List<Integer> keysList = new ArrayList<>(map.keySet());
        System.out.println("Список ключей: " + keysList);

        List<String> valuesList = new ArrayList<>(map.values());
        System.out.println("Список значений: " + valuesList);
    }
}
