package lesson_11; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 24-09-2024
*/

import java.util.Arrays;

public class HomeWork_4 {

 public static void main(String[] args) {
  // Исходный массив с крайними значениями
  int[] numbers = {1, Integer.MIN_VALUE, 3, 4, Integer.MAX_VALUE, Integer.MIN_VALUE, 6, 7, Integer.MAX_VALUE, 8};

  // Число, которое нужно удалить (например, минимальное значение типа int)
  int target = Integer.MIN_VALUE;

  // Вызов метода для удаления всех вхождений числа
  int[] newArray = removeElement(numbers, target);

  // Вывод нового массива
  System.out.println("Новый массив без числа " + target + ": " + Arrays.toString(newArray));
 }

 // Метод для удаления всех вхождений заданного числа из массива
 public static int[] removeElement(int[] array, int target) {
  // Считаем количество вхождений target в массиве
  int count = 0;
  for (int num : array) {
   if (num == target) {
    count++;
   }
  }

  // Создаем новый массив меньшего размера, исключая все вхождения target
  int[] newArray = new int[array.length - count];
  int index = 0;

  // Заполняем новый массив элементами, не равными target
  for (int num : array) {
   if (num != target) {
    newArray[index] = num;
    index++;
   }
  }

  return newArray;  // Возвращаем новый массив
 }
}
