package lesson_22.staticPoly;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Calculator {
    /*
    Статический полиморфизм - полиморфизм времени компиляции.
    Достигается он с помощью перегрузки методов.
    */

    // Метод для сложения двух целых чисел
    public static int add(int a, int b) {
        return a + b;
    }

    // Метод для сложения двух чисел с плавающей точкой
    public static double add(double a, double b) {
        return a + b;
    }

    // Главный метод программы
    public static void main(String[] args) {
        // Пример использования метода add с целыми числами
        int sumInt = Calculator.add(15, 29);
        System.out.println("Сумма целых чисел: " + sumInt);

        // Пример использования метода add с числами с плавающей точкой
        double sumDouble = Calculator.add(15.5, 29.3);
        System.out.println("Сумма чисел с плавающей точкой: " + sumDouble);
    }
}