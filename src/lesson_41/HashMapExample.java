package lesson_41;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 07-11-2024
 */
/*

 */
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создаем экземпляр HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Добавляем элементы
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 7);

        // Получаем значение по ключу
        System.out.println("Количество бананов: " + hashMap.get("Banana"));

        // Проходим по всем элементам с использованием цикла for-each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Удаляем элемент
        hashMap.remove("Apple");

        // Проверяем наличие ключа
        System.out.println("Есть ли в карте апельсин? " + hashMap.containsKey("Orange"));
    }
}
