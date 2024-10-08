package lesson_19;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 08-10-2024
*/

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // Исходный массив
        int[] array = {3, 2, 1, 4, 5, 32, 24, 45};

        // Пример использования Arrays.toString() - метод, который возвращает строковое представление массива.
        String arrayToString = Arrays.toString(array);
        System.out.println("Строковое представление массива: " + arrayToString);
        System.out.println(Arrays.toString(array)); // Альтернативный вывод

        System.out.println("\n ================= Сортировка массива ================= \n");

        // Пример сортировки части массива от индекса 1 до индекса 3 (конечный индекс не включается).
        Arrays.sort(array, 1, 3);
        System.out.println("Массив после сортировки от 1 до 3 индекса: " + Arrays.toString(array));

        System.out.println("\n ================= Бинарный поиск ================= \n");

        // Пример бинарного поиска значения 3 в массиве. Если значение найдено, возвращается его индекс, если нет - отрицательное значение.
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Результат бинарного поиска элемента 3: " + index);

        // Пример равенства массивов.
        int[] test = {0, 2, 1, 3};
        System.out.println("Оригинальный массив: " + Arrays.toString(array));
        System.out.println("Тестовый массив: " + Arrays.toString(test));

        // Используем Arrays.equals для проверки, равны ли массивы.
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("Равны ли массивы (Arrays.equals): " + isArraysEquals);

        // Пример поиска первого различия между массивами (индекс первого различия).
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Индекс первого различия (Arrays.mismatch): " + mismatchIndex);

        System.out.println("\n ================ Работа с многомерными массивами =============== \n");

        // Пример работы с многомерными массивами (3x4 массивы).
        int[][] arrayD = new int[3][4];
        int[][] arrayC = new int[3][4];

        // Заполняем один из массивов.
        arrayD[0][3] = 1;
        arrayD[2][2] = 5;

        // Используем deepEquals для глубокого сравнения многомерных массивов.
        boolean isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Равны ли многомерные массивы до изменений: " + isEquals);

        // Вывод многомерных массивов.
        System.out.println("Массив arrayD: " + Arrays.deepToString(arrayD));
        System.out.println("Массив arrayC: " + Arrays.deepToString(arrayC));

        // Изменение второго массива.
        arrayC[0][3] = 1;
        arrayC[2][2] = 5;

        // Снова сравниваем после изменений.
        isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Равны ли многомерные массивы после изменений: " + isEquals);

        System.out.println("\n ================ Arrays.copyOf и Arrays.copyOfRange =============== \n");

        // Пример использования Arrays.copyOf для создания копии массива
        int[] array1 = {0, 1, 2, 3};
        int[] copyOfTest = Arrays.copyOf(test, 10); // Новый массив длиной 10
        System.out.println("Оригинальный массив array1: " + Arrays.toString(array1));
        System.out.println("Копия массива (длиной 10): " + Arrays.toString(copyOfTest));

        // Используем Arrays.copyOfRange для создания нового массива из части исходного.
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Копирование диапазона от 3 до 10 (Arrays.copyOfRange): " + Arrays.toString(rangeFromInts));

        System.out.println("\n ================ System.arraycopy =============== \n");

        // Пример 1: Копирование части массива с использованием System.arraycopy.
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] destArray = new int[5];
        System.arraycopy(sourceArray, 2, destArray, 0, 5);
        System.out.println("Частичное копирование (System.arraycopy): " + Arrays.toString(destArray));

        // Пример 2: Полное копирование массива.
        int[] fullCopyArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, fullCopyArray, 0, sourceArray.length);
        System.out.println("Полное копирование (System.arraycopy): " + Arrays.toString(fullCopyArray));

        System.out.println("\n ================ Arrays.fill =============== \n");

        // Пример 1: Заполнение всего массива одним значением.
        int[] fillArray1 = new int[5];
        Arrays.fill(fillArray1, 7); // Заполняем весь массив значением 7.
        System.out.println("Заполнение массива значением 7: " + Arrays.toString(fillArray1));

        // Пример 2: Заполнение части массива.
        int[] fillArray2 = new int[10];
        Arrays.fill(fillArray2, 2, 5, 42); // Заполняем элементы с индекса 2 по 5 значением 42.
        System.out.println("Частичное заполнение массива значением 42: " + Arrays.toString(fillArray2));

        // Пример 3: Заполнение строкового массива.
        String[] stringArray = new String[4];
        Arrays.fill(stringArray, "Hello");
        System.out.println("Заполнение строкового массива: " + Arrays.toString(stringArray));

        // Пример 4: Заполнение массива boolean значениями.
        boolean[] boolArray = new boolean[5];
        Arrays.fill(boolArray, true);
        System.out.println("Заполнение boolean массива значением true: " + Arrays.toString(boolArray));
    }
}
