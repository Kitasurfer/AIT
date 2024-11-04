package lesson_38.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 04-11-2024
 */
public class ComparatorApp {
    public static void main(String[] args) {
        // Пример сортировки чисел
        int[] numbers = {9, 5, 2, 5, 6, 8};
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Пример сортировки строк
        String[] strings = {"sgh", "VVV", "fsfg"};
        Arrays.sort(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));

        // Создание и инициализация массива машин
        Car[] cars = {
                new Car("Alfa Romeo", 2021, 120),
                new Car("BMW", 2020, 130),
                new Car("Audi", 2019, 140),
                new Car("Mercedes", 2018, 250),
                new Car("Toyota", 2022, 190),
                new Car("Honda", 2021, 135),
                new Car("Ford", 2017, 110),
                new Car("Chevrolet", 2019, 130),
                new Car("Mazda", 2019, 140),
                new Car("Tesla", 2023, 260)
        };

        // Вывод несортированного массива машин
        System.out.println("\nUnsorted cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по году выпуска
        Arrays.sort(cars);
        System.out.println("\nSorted cars by year:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по скорости
        Arrays.sort(cars, Comparator.comparingInt(Car::getSpeed));
        System.out.println("\nSorted cars by speed:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по модели в алфавитном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        System.out.println("\nSorted cars by model (alphabetical):");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по длине модели
        Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.getModel().length(), car2.getModel().length()));
        System.out.println("\nSorted cars by model length:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Комбинированная сортировка: сначала по году, затем по скорости
        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            return (yearCompare == 0) ? Integer.compare(car1.getSpeed(), car2.getSpeed()) : yearCompare;
        });
        System.out.println("\nSorted cars by year, then speed:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по году в обратном порядке, затем по скорости
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear).reversed().thenComparing(Car::getSpeed));
        System.out.println("\nSorted cars by year (reversed), then speed:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по году, затем по модели с использованием лямбда-выражения
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear).thenComparing(Car::getModel));
        System.out.println("\nSorted cars by year, then model:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Проверка сортировки по году с вычитанием (так не рекомендуется из-за риска переполнения)
        Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.getModel().length(), car2.getModel().length()));
        System.out.println("\nSorted cars by year (using subtraction):");
        for (Car car : cars) {
            System.out.println(car);
        }


        Arrays.sort(cars, (car1, car2) -> Integer.compare(car2.getModel().length(), car1.getModel().length()));
        System.out.println("\nВ обратном порядке по длине модели:");
        for (Car car : cars) {
            System.out.println(car);
        }
        // Предположим, что Car имеет методы getModel(), getYear(), getSpeed()

// Определение максимальных размеров для каждого столбца
        int maxModelWidth = Arrays.stream(cars).mapToInt(car -> car.getModel().length()).max().orElse(10);
        int maxYearWidth = String.valueOf(Arrays.stream(cars).mapToInt(Car::getYear).max().orElse(4)).length();
        int maxSpeedWidth = String.valueOf(Arrays.stream(cars).mapToInt(Car::getSpeed).max().orElse(3)).length();

// Формат строки с динамическими размерами колонок
        String format = String.format("%%-%ds %%-%ds %%-%ds\n", maxModelWidth, maxYearWidth, maxSpeedWidth);

// Заголовок таблицы с динамическими размерами колонок
        StringBuilder result = new StringBuilder(String.format("\u001B[33m" + format + "\u001B[0m",
                "Модель", "Год", "Скорость"));

// Сортировка по году
        Arrays.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear());
        System.out.println("\nSorted cars by year (using subtraction):");

// Вывод отсортированных машин с использованием форматирования
        for (Car car : cars) {
            result.append(String.format(format, car.getModel(), car.getYear(), car.getSpeed()));
        }

        System.out.println(result);

    }
}
