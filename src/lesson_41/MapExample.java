package lesson_41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // Создаем карту (мапу) на основе HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "Java");
        map.put(4, "Python");

        System.out.println(Color.YELLOW + "\nТекущее содержимое карты:" + Color.RESET + " " + map);

        // Метод get(Object key) - возвращает значение по ключу
        String value = map.get(3);
        System.out.println(Color.BLUE + "\nПолучение значения по ключу:" + Color.RESET);
        System.out.println("map.get(3): " + (value != null ? Color.GREEN + value + Color.RESET : Color.RED + "null" + Color.RESET));

        // Пытаемся получить значение по несуществующему ключу
        value = map.get(100);
        System.out.println("map.get(100): " + (value != null ? Color.GREEN + value + Color.RESET : Color.RED + "null" + Color.RESET));

        // Метод getOrDefault(Object key, V defaultValue)
        System.out.println(Color.BLUE + "\nПолучение значения с использованием getOrDefault:" + Color.RESET);
        value = map.getOrDefault(3, "Default");
        System.out.println("map.getOrDefault(3, \"Default\"): " + Color.GREEN + value + Color.RESET);

        value = map.getOrDefault(100, "Default");
        System.out.println("map.getOrDefault(100, \"Default\"): " + Color.GREEN + value + Color.RESET);

        // Метод remove(Object key) - удаляет пару ключ-значение и возвращает значение
        System.out.println(Color.CYAN + "\nУдаление пары ключ-значение по ключу:" + Color.RESET);
        System.out.println("map.remove(4): " + (map.remove(4) != null ? Color.GREEN + "Успешно удалено" + Color.RESET : Color.RED + "null" + Color.RESET));
        System.out.println("map.remove(100): " + (map.remove(100) != null ? Color.GREEN + "Успешно удалено" + Color.RESET : Color.RED + "null" + Color.RESET));

        // Итоговое содержимое карты после удаления
        System.out.println(Color.YELLOW + "\nИтоговое содержимое карты:" + Color.RESET + " " + map);

        // Добавление отрицательного ключа и использования null в качестве ключа
        map.put(-1000, "Minus");
        System.out.println(Color.BLUE + "\nДобавление отрицательного ключа -1000:" + Color.RESET);
        System.out.println("map: " + map);

        // Использование null в качестве ключа
        map.put(null, "NullValue");
        System.out.println(Color.BLUE + "\nДобавление null в качестве ключа:" + Color.RESET);
        System.out.println("map: " + map);
    }
}
