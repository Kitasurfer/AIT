package lesson_11;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 24-09-2024
*/

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 8 };
        int sum = sumArray(array);
        System.out.println(sum);

    }
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;

    }

}
