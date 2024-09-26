package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 20-09-2024
*/

/*
Task 7
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */

public class HomeWork_08_7 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};

        int minIndex = 0;
        int maxIndex = 0;
        int min = array[0];
        int max = array[0];

        // Находим индексы минимального и максимального элементов
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        // Выводим начальный массив
        System.out.println("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Меняем местами минимальный и максимальный элементы
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        // Выводим изменённый массив
        System.out.println("Массив после замены: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
