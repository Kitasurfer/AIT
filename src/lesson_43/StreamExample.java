package lesson_43;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */
public class StreamExample {

    public static void main(String[] args) {
        task1(); // Вызов метода task1
        task2(); // Вызов метода task2
        task4(); // Вызов метода task4 для получения имен кошек
        task5(); // Вызов метода task5 для фильтрации кошек старше 4 лет
    }

    private static void task4() {
        // Получаем список кошек и создаем поток имен
        List<Cat> cats = getListCats(); // Получаем список кошек

        // Извлекаем имена кошек и собираем их в список
        List<String> catNames = cats.stream()
                .map(Cat::getName) // Преобразуем каждый объект Cat в его имя
                .collect(Collectors.toList()); // Собираем имена в список

        // Выводим список имен кошек
        System.out.println("Имена кошек: " + catNames);
    }

    private static void task5() {
        // Получить список кошек
        List<Cat> cats = getListCats();

        // Фильтруем кошек по возрасту > 4, преобразуем в имена и собираем в список
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getAge() > 4) // Фильтруем по возрасту больше 4
                .map(Cat::getName) // Преобразуем объекты Cat в их имена
                .collect(Collectors.toList()); // Собираем имена в список

        // Выводим результат
        System.out.println("Имена кошек с возрастом больше 4: " + catNames);
    }

    /*private static void task5() {
        // Получаем список кошек и фильтруем по возрасту больше 4 лет
        List<Cat> cats = getListCats();

        List<Cat> olderCats = cats.stream()
                .filter(cat -> cat.getAge() > 4) // Фильтруем кошек с возрастом больше 4 лет
                .collect(Collectors.toList()); // Собираем результат в список

        // Выводим отфильтрованных кошек
        System.out.println("Кошки старше 4 лет: " + olderCats);
    }*/

    private static void task2() {
        // Получаем список кошек и создаем поток с фильтрацией по возрасту
        List<Cat> cats = getListCats(); // Получаем список кошек
        Stream<Cat> catStream = cats.stream() // Создаем поток из списка кошек
                .filter(cat -> cat.getAge() > 3); // Фильтруем кошек, возраст которых больше 3

        // Сбор отфильтрованных кошек в новый список
        List<Cat> fatCat = catStream.collect(Collectors.toList()); // Собираем результат в список
        System.out.println("Кошки старше 3 лет: " + fatCat); // Выводим результат
    }

    private static List<Cat> getListCats() {
        // Создаем список объектов Cat
        return Arrays.asList(
                new Cat("Bear", 2, "brown"),
                new Cat("Py", 7, "green"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "red")
        );
    }

    private static void task1() {
        // Исходный список чисел
        List<Integer> integers = Arrays.asList(-1, 12, 0, 5, 1, -15, 24, 0);

        // Используем Stream API для фильтрации положительных чисел, сортировки и сбора результата в список
        List<Integer> result = integers.stream() // Преобразуем список в поток
                .filter(i -> i > 0) // Фильтруем только положительные числа
                .sorted(Comparator.naturalOrder()) // Сортируем по возрастанию
                .collect(Collectors.toList()); // Собираем результат в список

        // Выводим результат
        System.out.println("Отсортированные положительные числа: " + result);
    }
}
