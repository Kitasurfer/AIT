package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

import java.util.Scanner;

public class HomeWork_07_02 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6, 7 -> System.out.println("Выходной");
            default -> System.out.println("Ошибка ввода");
        }

    }

}