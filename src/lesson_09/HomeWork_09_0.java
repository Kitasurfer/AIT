package lesson_09; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 22-09-2024
*/

/*
Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */

public class HomeWork_09_0 {
    public static void main(String[] args) {
        // Вызов метода countSymbols, который выводит результат на экран
        countSymbols("hello");
    }

    // Метод выводит количество символов
    private static void countSymbols(String line) {
        // Выводим длину строки на экран
        System.out.println("Количество символов: " + line.length());
    }
}
