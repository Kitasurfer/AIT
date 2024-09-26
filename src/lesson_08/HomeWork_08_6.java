package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 20-09-2024
*/
/*
Массивы
Task 6
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

import java.util.Random;

public class HomeWork_08_6 {
    public static void main(String[] args) {

        Random random = new Random();
        int len = 5 + random.nextInt(11);

        int[] array = new int[len];


        int arrayLegth = array.length; //Получить длину массива
        int i = 0;
        System.out.print("[");

        while (i < arrayLegth) {
            array[i] = random.nextInt(101) - 50;

            System.out.print(array[i] + ((i != arrayLegth - 1) ? ", " : "]\n"));

           /* if (i != arrayLegth -1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }*/
            i++;
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;
        while (i < arrayLegth) {
            sum += array[i];

            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];

            i++;
        }

        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("average: " + sum / (double) arrayLegth);

    }

}
