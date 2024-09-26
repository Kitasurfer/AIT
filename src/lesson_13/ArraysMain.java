package lesson_13;  // Определение пакета, в котором находится данный класс

import java.util.Arrays;
import java.util.Random;

/*
Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 26-09-2024
*/

public class ArraysMain {
    public static void main(String[] args) {

        // Создаем массив с фиксированными значениями
        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77};
        // Выводим длину массива
        System.out.println("Длина массива: " + ints.length);

        // Линейный поиск числа 100 в массиве
        int index = ArraysUtils.linearSearch(ints, 100);
        System.out.println("Индекс элемента: " + index);  // Выводим результат линейного поиска

        // Выводим массив до сортировки
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(ints));  // Преобразуем массив в строку и выводим

        // Сортируем массив методом выбора
        ArraysUtils.sortSelection(ints);

        // Выводим массив после сортировки
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));

        // Ищем число 87 с помощью бинарного поиска в отсортированном массиве
        int number = 87;
        int idx = ArraysUtils.binarySearch(ints, number);
        System.out.println("Индекс числа в массиве: " + idx);

        // Создаем массив на 1 000 000 элементов с рандомными значениями от 0 до 10 000
        int[] testArray = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(10_001); // Генерируем случайные числа от 0 до 10 000
        }

        System.out.println("\n ================================== \n");

        // Сортируем массив с помощью встроенной сортировки
        Arrays.sort(testArray); // Сортировка встроенным методом Arrays.sort()

        // Бинарный поиск числа 5000 в отсортированном массиве
        number = 5000;
        idx = ArraysUtils.binarySearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (бинарный поиск): " + idx);

        // Линейный поиск числа 5000 в массиве
        idx = ArraysUtils.linearSearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (линейный поиск): " + idx);
    }
}
