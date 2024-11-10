package lesson_42;

import java.util.*;

import static lesson_19.FinalDemo.colors;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 08-11-2024
 */
/*

 */
public class MapExample {
    public static void main(String[] args) {

        // Создаем объект Map с типами Integer и String
        Map<Integer, String> mapColors = new HashMap<>();

        // Добавляем элементы в Map
        mapColors.put(1, "red");
        mapColors.put(2, "green");
        mapColors.put(3, "blue");
        mapColors.put(4, "yellow");
        mapColors.put(5, "orange");

        // Выводим весь Map
        System.out.println("1: " + mapColors);
        // Выводим размер Map
        System.out.println("2: " + mapColors.size());
        // Получаем значение по ключу 1
        System.out.println("3: " + mapColors.get(1));
        // Проверяем, содержит ли Map ключ 32
        System.out.println("4: " + mapColors.containsKey(32));
        // Проверяем, содержит ли Map значение "green"
        System.out.println("5: " + mapColors.containsValue("green"));

        // Выводим переменную colors (предполагается, что colors импортирован из другого класса)
        System.out.println("6: " + colors);

        // Удаляем элемент с ключом 5 и выводим удаленное значение
        String deletedValue = mapColors.remove(5);
        System.out.println("7: удаляем: " + deletedValue);
        // Выводим Map после удаления
        System.out.println("8: " + mapColors);

        // Очищаем весь Map
        mapColors.clear();
        // Выводим Map после очистки
        System.out.println("9: " + mapColors);

        // Проверяем, пуст ли Map
        System.out.println("10: " + mapColors.isEmpty());

        // Добавляем новые элементы в Map
        mapColors.put(6, "yellow");
        mapColors.put(7, "orange");
        mapColors.put(8, "white");
        mapColors.put(24, "white");
        // Выводим обновленный Map
        System.out.println("11: " + mapColors);

        System.out.println("\n=========================\n");

        // Получаем коллекцию всех значений в Map
        Collection<String> values = mapColors.values();
        // Выводим размер коллекции значений
        System.out.println("12: " + "values: " + values.size());

        // Получаем набор всех ключей в Map
        Set<Integer> keysSet = mapColors.keySet();
        // Выводим набор ключей
        System.out.println("13: keySet: " + keysSet);
        // Перебираем и выводим каждый элемент (ключ и значение) из набора ключей
        for (Integer element : keysSet) {
            System.out.println("14: " + element + ":" + mapColors.get(element) + "; ");
        }
        System.out.println();

        // Удаляем ключ 7 из набора ключей
        keysSet.remove(7);
        // Выводим обновленный набор ключей и Map
        System.out.println("15: " + keysSet);
        System.out.println("16: " + mapColors);

        // Удаляем значение "yellow" из коллекции значений
        values.remove("yellow");
        // Выводим обновленную коллекцию значений и Map
        System.out.println("17: " + values);
        System.out.println("18: " + mapColors);

        // Добавляем новые элементы в Map
        mapColors.put(11, "yellow");
        mapColors.put(12, "orange");

        // Используем entrySet() для перебора всех пар "ключ-значение"
        for (Map.Entry<Integer, String> entry : mapColors.entrySet()) {
            System.out.printf("19: " + entry.getKey() + " -> " + entry.getValue() + ", ");
        }

        System.out.println("\n=============================\n");

        // Выводим весь Map после изменений
        System.out.println(mapColors);

        // Добавляем элемент с ключом 10 и значением "red"
        mapColors.put(10, "red");
        // Выводим Map
        System.out.println(mapColors);
        // Изменяем значение ключа 10 на "green"
        mapColors.put(10, "green");
        // Выводим Map после изменения
        System.out.println(mapColors);

        // Заменяем значение ключа 10 на "yellow"
        mapColors.replace(10, "yellow");
        // Выводим Map после замены
        System.out.println(mapColors);

        // Используем метод forEach для вывода всех пар "ключ-значение"
        mapColors.forEach((k, v) -> {
            System.out.println("Iteration: " + k + ", " + v);
           // System.out.println("\n======================\n");

        });

    }
}
