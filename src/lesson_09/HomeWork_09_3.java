package lesson_09;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 21-09-2024
*/
import java.util.Random;
/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти,
и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class HomeWork_09_3 {

        public static void main(String[] args) {
            // Создаем массив на 50 элементов
            int[] numbers = new int[50];

            // Генерируем случайные числа от 1 до 100 и заполняем массив
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100) + 1; // Генерация числа от 1 до 100
            }
            System.out.println("Все числа в массиве:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println(); // Переход на новую строку

            // Переменная для подсчета количества простых чисел
            int primeCount = 0;

            // Проходим по массиву и ищем простые числа
            System.out.println("Простые числа в массиве:");
            for (int num : numbers) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    primeCount++;
                }
            }

            // Выводим количество найденных простых чисел
            System.out.println("\nКоличество простых чисел: " + primeCount);
        }

        // Метод для проверки, является ли число простым
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // Числа меньше 2 не являются простыми
            }
            // Проверяем делимость числа на числа от 2 до корня из num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Если делится на i, то число не простое
                }
            }
            return true; // Число простое
        }
    }
