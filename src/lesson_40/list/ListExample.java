package lesson_40.list;

import java.util.*;

/// Group: 52-1, "AIT Hi-tech team" GMBH
/// Author: Bogdan Fesenko
/// Date: 06-11-2024
/// Класс демонстрирует работу с коллекциями в Java и методами интерфейса List,
/// такими как добавление, удаление, поиск и сортировка элементов.
public class ListExample {
    public static void main(String[] args) {

        System.out.println("=== Инициализация коллекций ===");

        // Пример использования различных типов коллекций
        Collection<Integer> collection = new ArrayList<>();
        collection = new HashSet<>(); // Хранит уникальные элементы, порядок не гарантирован
        collection = new PriorityQueue<>(); // Приоритетная очередь, упорядочивает элементы
        Iterable<Integer> iterable = new ArrayList<>(); // Интерфейс Iterable позволяет использовать for-each циклы

        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>(); // Создает пустой ArrayList с емкостью по умолчанию (10 элементов)
        list = new ArrayList<>(50); // Создает пустой ArrayList с заданной емкостью
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // Создает ArrayList, содержащий элементы из другой коллекции

        System.out.printf("Инициализированный ArrayList: %s%n%n", list);

        // Конструкторы LinkedList
        list = new LinkedList<>(); // Создает пустой LinkedList
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); // Создает LinkedList с элементами из другой коллекции

        System.out.printf("Инициализированный LinkedList: %s%n%n", list);

        // Методы интерфейса List

        System.out.println("=== Операции с List ===");

        // Добавление элементов в конец списка
        list.add(1000);
        list.add(-100);
        System.out.printf("После добавления элементов 1000 и -100: %s%n%n", list);

        // Добавление элемента на указанную позицию
        list.add(2, 100);
        System.out.printf("После добавления 100 на позицию 2: %s%n%n", list);

        // Получение элемента по индексу
        int value = list.get(5);
        System.out.printf("Элемент на индексе 5: %d%n%n", value);

        // Удаление элемента по индексу
        System.out.printf("Удаление элемента на индексе 5, удалённый элемент: %d%n", list.remove(5));
        System.out.printf("После удаления элемента на индексе 5: %s%n%n", list);

        // Удаление элемента по значению
        if (list.remove(Integer.valueOf(1000))) {
            System.out.println("Элемент со значением 1000 успешно удален.");
        } else {
            System.out.println("Элемент 1000 не найден в списке.");
        }
        System.out.printf("После удаления элемента 1000: %s%n%n", list);

        // Поиск элементов по значению
        System.out.printf("Первое вхождение -100: индекс %d%n", list.indexOf(-100));
        System.out.printf("Последнее вхождение -100: индекс %d%n%n", list.lastIndexOf(-100));

        // Сортировка списка с использованием компаратора (по убыванию)
        list.sort((i1, i2) -> i2.compareTo(i1));
        System.out.printf("После сортировки по убыванию (лямбда): %s%n%n", list);

        // Альтернативная сортировка с использованием анонимного класса (по убыванию)
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });
        System.out.printf("После сортировки по убыванию (анонимный класс): %s%n%n", list);

        // Создание подсписка
        List<Integer> subList = list.subList(1, 5);
        System.out.printf("Подсписок от индекса 1 до 4: %s%n", subList);
    }
}
