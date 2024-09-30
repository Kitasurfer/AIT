package lesson_14; /* Group: 52-1, "AIT Hi-tech team" GMBH
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
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 22, 36, 47, 55, 88, 20};

        // Вызываем метод для вычисления суммы четных чисел в массиве
        int sum = sumEvenNumbers(numbers);

        // Вывод
        System.out.println("Сумма четных чисел: " + sum);
    }


    public static int sumEvenNumbers(int[] array) { // Метод для вычисления суммы всех четных чисел в массиве

        int sum = 0; // Создаем переменную для хранения суммы четных чисел

        // Проходим по каждому элементу массива
        for (int num : array) {

            if (num % 2 == 0) { /* Проверяем, является ли число четным
                 Если число четное, добавляем его к общей сумме*/
                sum += num;
            }
        }

        // Итоговая сумма выводим
        return sum;
    }
}
