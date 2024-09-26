package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 19-09-2024
*/

/*
Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
 */
public class HomeWork_08_3 {
    public static void main(String[] args) {
        int start = 1;
        int stop = 100;
        while (start <= stop) {
            if (start % 5 == 0) {
                System.out.println("Числа которые / на 5: " + start);
            }
            start++;

        }
    }
}


