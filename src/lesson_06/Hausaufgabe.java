package lesson_06;

import java.util.Scanner;

public class Hausaufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.nextLine(); // Чтение строки

        // Проверяем, что введено четырехзначное число
        if (numberString.length() != 4) {
            System.out.println("This number is not 4 digit");
            return;
        }

        // Проверка на то, что строка состоит только из цифр
        boolean isInteger = isNumericInteger(numberString);
        if (!isInteger) {
            System.out.println("Not valid number!");
            return;
        }

        // Преобразуем каждый символ строки в число
        int firstNumber = numberString.charAt(0) - '0';
        int secondNumber = numberString.charAt(1) - '0';
        int thirdNumber = numberString.charAt(2) - '0';
        int fourthNumber = numberString.charAt(3) - '0';

        // Проверяем, является ли это "счастливым" числом
        if ((firstNumber + secondNumber) == (thirdNumber + fourthNumber)) {
            System.out.println("This is lucky number");
        } else {
            System.out.println("This is not a lucky number");
        }

        scanner.close(); // Закрываем Scanner для освобождения ресурсов
    }

    // Метод для проверки, является ли строка числом
    public static boolean isNumericInteger(String str) {
        try {
            Integer.parseInt(str);  // Преобразуем строку в целое число
            return true;  // Если исключение не выброшено, строка является числом
        } catch (NumberFormatException e) {
            return false;  // Если выброшено исключение, строка не является числом
        }
    }
}
