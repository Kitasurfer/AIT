package lesson_15; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 28-09-2024
*/
/* Task 2
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */

public class HomeWork_15_1 {

    public static void main(String[] args) {
        // Инициализируем массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вызываем метод sumEvenNumbers для вычисления суммы четных чисел в массиве
        int sum = sumEvenNumbers(numbers);

        // Выводим результат на экран
        System.out.println("Сумма четных чисел: " + sum);
    }

    // Метод для вычисления суммы всех четных чисел в массиве
    public static int sumEvenNumbers(int[] array) {
        // Переменная для хранения суммы четных чисел
        int sum = 0;

        // Проходим по каждому элементу массива
        for (int num : array) {
            // Проверяем, является ли число четным
            if (num % 2 == 0) {
                // Если число четное, добавляем его к общей сумме
                sum += num;
            }
        }

        // Возвращаем итоговую сумму
        return sum;
    }
}
