package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 19-09-2024
*/

import java.util.Scanner;

/*
Task 4 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит
правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово,
программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
и выведите это количество на экран.
 */
public class HomeWork_08_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userSlovo = " ";
        int popitki = 0;

        while (!userSlovo.equals("hello")) {
            System.out.print("Введите слово 'hello': ");  // вводим
            userSlovo = scanner.nextLine(); // читаем
            popitki++; // +1

            if (!userSlovo.equals("hello")) { // если неправильно то дальше
                System.out.println("Неправильное слово.");
            }
        }

        System.out.println("Спасибо! Вы ввели правильное слово.");
        System.out.println("Количество попыток: " + popitki);
    }
}

