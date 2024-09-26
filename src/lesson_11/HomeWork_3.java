package lesson_11;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 24-09-2024
*/

/*
Task 3 * (Опционально)
Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 */
public class HomeWork_3 {
    public static void main(String[] args) {

        // Первая строка для проверки
        String firstString = "123454321";  // Строка с цифрами которая является палиндромом

        // Вторая строка для проверки
        String secondString = "Лёша на полке Клопа нашёл";  // Фраза-палиндром

        // Вызываем метод для первой строки
        if (isPalidrom(firstString)) {
            System.out.println("First Polidrome: ");
        } else {
            System.out.println("Error: ");
        }
        // Вторую строку выводим
        if (isPalidrom(secondString)) {
            System.out.println("Second Palidrom: ");
        } else {
            System.out.println("Error second: ");
        }
    }
    // Проверяем строки на палидром
    public static boolean isPalidrom(String str) {
        // Чтобы удалить пробелы и остальные знаки и приводим к нижнему регистру
        String cliringStr = str.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        int start = 0; // стартуем
        int finish = cliringStr.length() -1; // окончание строки

        // ведем пока не пересекутся
        while (start < finish) {
            if (cliringStr.charAt(start) != cliringStr.charAt(finish)) {
                return false; // если не рано это не палидром
            }
            start++; //двигаемся вперед с начала
            finish--; // двигаемся назад с конца
        }
        return true; // если все совпадает это палидром!

    }

}
