package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 19-09-2024
*/

/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */
public class HomeWork_08_1 {
    public static void main(String[] args) {
        // 1. ==================
     /*
     long produkt = 1;

     for (int i = 1; i <= 15; i++)
      produkt *= i;
     System.out.println("Произведение всех чисел от 1 до 15: " + produkt);*/

        // Opt2============
        int start = 1;
        int stop = 15;
        long result = 1L;
        for (int i = start; i <= stop; i++) {
            result *= i;
        }
        System.out.println(result);

    }
}

