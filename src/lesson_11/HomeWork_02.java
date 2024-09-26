package lesson_11;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 24-09-2024
*/

/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        int[] numbers = {10, 22, 35, 47, 54, 88};
        double average = findAverage(numbers); // Метод вычисления среднего значения


        System.out.println("Среднее арифметическое: " + average); // Выводим результат

    }

    // Находим среднее значение
    public static int findAverage(int[] array) {
        int sum = 0;

        // Суммируем весь массив
        for (int num : array) {
            sum += num;

        }

        int i = (int) ((double) sum / array.length); // Возвращаем среднее значение
        return i;

    }

}
