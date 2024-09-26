package lesson_10;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 23-09-2024
*/

import java.util.Arrays;

/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода

 */
public class HomeWork_1 {
    public static void main(String[] args) {
        int[] array = {0, 5, 10, 15, 20, 5, 1, 2, 3, 4, 5};
        copyOfArray(array, 20);
    }

    public static void copyOfArray(int[] array, int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            }
            System.out.println(newArray[i]);
        }
    }
}
