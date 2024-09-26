package lesson_10;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 23-09-2024
*/

import java.util.Arrays;

/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class HomeWork_2 {
    public static void main(String[] args) {
        String[] array = {"Hello!", "Options", "ok"};
        System.out.println(Arrays.toString(minAndMaxStringLength(array)));
    }

    public static String[] minAndMaxStringLength(String[] array) {
        String min = array[0];
        String max = array[0];
        String[] x = new String[2];
        for (int i = 1; i < array.length; i++) {
            if (min.length() > array[i].length()) {
                min = array[i];
            }
            if (max.length() < array[i].length()) {
                max = array[i];

            }
        }
        x[0] = min;
        x[1] = max;
        return x;
    }

}
