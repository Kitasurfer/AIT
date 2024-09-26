package lesson_10;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 23-09-2024
*/

/*
Task 4* со звездочкой (Опционально)
Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент,
который будет находиться на k-й позиции в объединенном отсортированном массиве.

Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7
Copy
Вывод : 256

Можно такой вывод:

72, 86, 100, 112, 113, 119, 256
Искомое число: 256
Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -

[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
7-й элемент (по счету) этого массива хранит значение 256.
 */
public class HomeWork_4 {

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int kthElement = findKthElement(arr1, arr2, k);

        System.out.print("Объединенные первые " + k + " элементов: ");
        for (int i = 1; i <= k; i++) {
            System.out.print(findKthElement(arr1, arr2, i) + " ");
        }

        System.out.println("\nИскомое число: " + kthElement);
    }

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int i = 0, j = 0, count = 0, result = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result = arr1[i];
                i++;
            } else {
                result = arr2[j];
                j++;
            }
            count++;
            if (count == k) {
                return result;
            }
        }

        while (i < arr1.length) {
            result = arr1[i];
            i++;
            count++;
            if (count == k) {
                return result;
            }
        }

        while (j < arr2.length) {
            result = arr2[j];
            j++;
            count++;
            if (count == k) {
                return result;
            }
        }

        return result;
    }
}
