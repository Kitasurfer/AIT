package lesson_06;
/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/
/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */
import java.util.Random;

public class HomeWork_06_02 {
    public static void main(String[] args) {

        Random random = new Random(); // Объект генерирует случайные числа

        // Эти методы генерирую случайное число от 0 до 100 4 числа
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("Num: " + num1 + "," + num2 + "," + num3 +  "," + num4);

        int max = num1; /* Переменной max присваивается значение num1 как начальное
        предполагаемое максимальное число */

        if (num2 > max) { // сравнивает значения переменных, если больше текущего обновляется
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
       // System.out.println("Max num: " + max); // метод Math.max(), который возвращает большее из двух чисел.
        // int max2 = Math.max(Math.max(num1, num2), Math.max(num3, num4)); // Снова сравнивает
        // System.out.println("Max: " + max2); // Выдает максимальное число
        System.out.println("Max: " + max);
    }
}
