package lesson_15; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 28-09-2024
*/
/*Task 4 * (Опционально)
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово и подсчитывает количество
гласных и согласных букв в этом слове.
 */

import java.util.Scanner;

public class HomeWork_15_4 {
    public static void main(String[] args) {
        // Создаем сканер для ввода данных от пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести слово
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase(); // Приводим слово к нижнему регистру

        // Список гласных для русского и английского языков
        String vowelsList = "аеёиоуыэюяaeiou";

        // Подсчет гласных с помощью Stream API
        long vowels = word.chars()
                .filter(c -> vowelsList.indexOf(c) != -1)
                .count();

        // Подсчет согласных с учетом обеих систем письма (латиница и кириллица)
        long consonants = word.chars()
                .filter(c -> Character.isLetter(c) && vowelsList.indexOf(c) == -1)
                .count();

        // Вывод результатов
        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}
