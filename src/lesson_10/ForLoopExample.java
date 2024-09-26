package lesson_10; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 23-09-2024
*/

import java.util.Random;

public class ForLoopExample {

    public static void main(String[] args) {
        int i1 = 5;

        // Исправление бесконечного цикла: добавлено ограничение в 1_000_000
        for (i1 = 0; i1 <= 1_000_000; i1 = i1 + 100_000) {
            System.out.println(i1 + ", ");
        }
        System.out.println();

        // Цикл с добавлением символов $ в строку
        for (String str = "Hello!"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        System.out.println("Продолжение кода");

        if (true) System.out.println("True");

        int k = 14;
        // Цикл с двумя счетчиками
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        System.out.println("\n =========================");

        // Создать массив целых чисел случайной длины в диапазоне от 5 до 15
        // Заполнить массив случайными числами от -50 до 50 включительно

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5]; // получить случайную длину массива
        System.out.println("Длина массива: " + ints.length);

        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // (0..100) - 50 -> (-50..50)
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }

        // continue и break
        for (int i = 1; i < 7; i++) {
            if (i == 5) continue; // переход к следующей итерации цикла
            System.out.print(i + ", ");
        }
        System.out.println();

        // Исправленный цикл с break
        for (int i = 1; i < 7; i++) {
            if (i == 3) break; // завершение цикла при i == 3
            System.out.print(i + "; ");
        }
        System.out.println("\nEnd loop with break");

        // Continue и break Работает аналогично while
        int y = 1;
        while (y < 7) {
            if (y == 3) {
                y++;  // Увеличиваем y, чтобы не зациклиться при использовании continue
                continue;
            }
            System.out.print(y + ", ");
            y++;  // Увеличиваем y после каждой итерации
        }
        System.out.println("\nEnd while loop with continue");

    }
}
