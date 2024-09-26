package lesson_05;

import java.util.Scanner;

/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
public class HomeWork_05_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку четной длинны: "); // Просим ввести строку четную
        String input = scanner.nextLine();

        if (input.length() % 2 == 0) {
            int middleIndex = input.length() / 2;
            String middleChars = input.substring(middleIndex - 1, middleIndex + 1);

            System.out.println("Два средних символа: " + middleChars);
        } else {
            System.out.println("Ошибка: Введенная строка не имеет четную длинну. ");
        }
        scanner.close();
    }
}
