package lesson_41;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 07-11-2024
 */
/*

 */
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Создаем экземпляр LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Добавляем элементы
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 7);

        // Получаем значение по ключу
        System.out.println("Количество бананов: " + linkedHashMap.get("Banana"));

        // Проходим по всем элементам с использованием цикла for-each
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Удаляем элемент
        linkedHashMap.remove("Apple");

        // Проверяем наличие ключа
        System.out.println("Есть ли в карте апельсин? " + linkedHashMap.containsKey("Orange"));
    }
}
