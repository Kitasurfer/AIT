package lesson_11;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 24-09-2024
*/

import java.util.Arrays;

public class DZ_10_1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 3, 4, 5, 6, 7, 8};
        copyOfArray(array, 10);
        String str = "Java";

        str = " !,.n";

        if (str !=null) {
            System.out.println(str.length());
            System.out.println(str.toUpperCase());
        }

        int[] arr1 = new int[5];
        copyOfArray(arr1, 2);
    }

    public static void copyOfArray(int[] array, int newLength) {
        int[] result = new int[newLength]; // Объявление нового массива

        // Копирование элементов из старого массива в новый
        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }


        // Вывод нового массива
        System.out.println(Arrays.toString(result));
    }
}
