package lesson_14; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 28-09-2024
*/

/*
Task 3 * (Опционально)
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */
public class HomeWork_15_3 {

    public static void main(String[] args) {
        // Инициализируем массив целых чисел
        int[] numbers = {10, 5, 20, 15, 30, 25, 5, 56, 77, 98, 24};

        // метод для поиска второго по величине числа
        int secondLargest = findSecondLargest(numbers);

        // Вывод
        System.out.println("Второе по величине число: " + secondLargest);
    }

    // нахождение второго по величине числа в массиве
    public static int findSecondLargest(int[] array) {
        // Длинна массива должна быть больше 2-х чисел
        if (array.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать хотя бы два элемента.");
        }

        // Инициализируем наибольшее и второе наибольшее числа
        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;

        // Найдем наибольшее и второе наибольшее
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Не найдено второго по величине числа.");
        }

        // Выводим второе по величине число
        return secondLargest;
    }
}
