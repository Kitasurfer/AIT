package lesson_15;/* Group: 52-1, "AIT Hi-tech team" GMBH 
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
  int[] numbers = {10, 5, 20, 15, 30, 25, 5};

  // Вызываем метод для поиска второго по величине числа
  int secondLargest = findSecondLargest(numbers);

  // Выводим результат на экран
  System.out.println("Второе по величине число: " + secondLargest);
 }

 // Метод для нахождения второго по величине числа в массиве
 public static int findSecondLargest(int[] array) {
  // Если в массиве меньше двух элементов, нельзя найти второе по величине число
  if (array.length < 2) {
   throw new IllegalArgumentException("Массив должен содержать хотя бы два элемента.");
  }

  // Инициализируем две переменные для хранения наибольшего и второго наибольшего чисел
  int largest = Integer.MIN_VALUE;
  int secondLargest = Integer.MIN_VALUE;

  // Проходим по каждому элементу массива
  for (int num : array) {
   // Проверяем, является ли текущее число больше наибольшего
   if (num > largest) {
    // Если так, обновляем второе наибольшее и наибольшее
    secondLargest = largest;
    largest = num;
   } else if (num > secondLargest && num != largest) {
    // Если текущее число меньше наибольшего, но больше второго наибольшего
    secondLargest = num;
   }
  }

  // Возвращаем второе по величине число
  return secondLargest;
 }
}
