package lesson_09; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 22-09-2024
*/

import java.util.Arrays;

public class HomeWork_09_1 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};  // Исходный массив
        int index = 2;
        boolean flag = true;

        // Пример вызова различных методов
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Печать массива в обратном порядке с использованием while
        System.out.println("Обратный порядок (while):");
        printReverseArrayWhile(array);

        // Печать массива с указанным индексом
        System.out.println("Часть массива с индексом " + index + ":");
        printReverseArrayWhile(array, index);

        // Печать массива с флагом
        System.out.println("Печать массива с флагом: " + flag);
        printReverseArrayWhile(array, flag);
    }

    // Метод, который печатает массив в обратном порядке, начиная с указанного индекса (while)
    public static void printReverseArrayWhile(int[] arr, int index) {
        System.out.print("[");
        int i = arr.length - 1;
        while (i >= index) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
            i--;
        }
    }

    // Метод для печати массива в обратном порядке (без индекса, для совместимости)
    public static void printReverseArrayWhile(int[] arr) {
        printReverseArrayWhile(arr, 0);  // Печать всего массива в обратном порядке
    }

    // Метод для печати массива с булевым флагом
    public static void printReverseArrayWhile(int[] arr, boolean flag) {
        if (flag) {
            // Печатаем весь массив в обратном порядке
            printReverseArrayWhile(arr);
        } else {
            // Печатаем массив от начала до конца в обычном порядке
            printReverseArrayWhile(arr, arr.length - 1);
        }
    }

    // Альтернативный метод с использованием for (по аналогии с while)
    public static void printReverseArrayFor(int[] arr, int index) {
        System.out.print("[");
        // Печать части массива до индекса
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }

        // Печать части массива от индекса в обратном порядке
        for (int i = arr.length - 1; i >= index; i--) {
            System.out.print(arr[i] + (i > index ? ", " : "]\n"));
        }
    }
}
