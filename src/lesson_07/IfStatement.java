package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

import java.util.Random;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        int y = 125;
        y = 12;

        if (y > 11) {
            System.out.println("Всем привет! ");
            System.out.println("Сейчас y равен: " + y);
        } else if (y > 7) {
            System.out.println("Мы находимся в блоке ELSE if: " + y);
            System.out.println("Сейчас y равен: " + y);
        } else {
            System.out.println("Мы находимся в блоке else: " + y);
            System.out.println("Сейчас y равен: " + y);
        }

        System.out.println("Продолжение программы: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 или 10: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число один!");
        } else if (number == 10) {
            System.out.println("Вы ввели число 10!");
        } else {
            System.out.println("Вы ввели неверное число!");
        }

        // Генерация случайных чисел
        Random random = new Random();
        int v1 = random.nextInt(50);
        int v2 = random.nextInt(50);
        int v3 = random.nextInt(50);

        System.out.println(v1 + " | " + v2 + " | " + v3);

        // Инициализация минимального значения
        int min = v1;

        // Сравнение второго значения с текущим минимальным
        if (v2 < min) {
            min = v2;
        }

        // Сравнение третьего значения с текущим минимальным
        if (v3 < min) {
            min = v3;
        }

        // Вывод минимального значения
        System.out.println("min: " + min);
    }
}
