package lesson_10; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko; Date: 23-09-2024 */

import java.util.Arrays; // Импортируем класс Arrays для удобного вывода массива в виде строки.

/*
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив,
состоящий только из простых чисел, присутствующих в изначальном массиве.

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
*/
public class HomeWork_3 { // Основной класс программы

    public static void main(String[] args) { // Главный метод, запускающий программу
        int[] arr = {0, 13, -25, 11, 31, 55, 98, 11, 5}; // Инициализация исходного массива целых чисел.

        // Вызов метода для получения массива простых чисел
        int[] simpled = simleArray(arr);

        // Вывод входного и выходного массива на экран
        System.out.print("вход -> " + Arrays.toString(arr)); // Преобразуем массив arr в строку и выводим.
        System.out.println(" -> выход " + Arrays.toString(simpled)); // Преобразуем результат в строку и выводим.
    }

    // Метод для фильтрации массива и возврата массива, состоящего только из простых чисел
    private static int[] simleArray(int[] arr) {
        int[] result = new int[arr.length]; // Создаём новый массив для хранения простых чисел. Размер совпадает с исходным массивом.
        int index = 0; // Индекс для записи простых чисел в новый массив.

        // Проходим по каждому элементу исходного массива
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // Текущий элемент массива сохраняем в переменную num.

            // Проверяем, является ли число простым
            if (isSimple(num)) {
                result[index] = num; // Если число простое, сохраняем его в массив result.
                index++; // Увеличиваем индекс для следующего простого числа.
            }
        }

        // Создаём новый массив, содержащий только простые числа (без лишних нулей)
        int[] newResult = new int[index]; // Новый массив длиной index (количество простых чисел).

        // Копируем простые числа из result в новый массив newResult
        for (int i = 0; i < newResult.length; i++) {
            newResult[i] = result[i];
        }

        return newResult; // Возвращаем массив с простыми числами.
    }

    // Метод для проверки, является ли число простым
    private static boolean isSimple(int num) {
        if (num < 2) { // Если число меньше 2, оно не может быть простым.
            return false;
        }

        // Проверяем делимость числа на все числа от 2 до квадратного корня из num
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) { // Если число делится на любое число без остатка, оно не простое.
                return false;
            }
        }

        return true; // Если делителей не найдено, число простое.
    }
}
