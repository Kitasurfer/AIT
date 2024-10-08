package homework_19;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 08-10-2024
*/

/*

 */
public class Calculator {

    private static final double PI = Math.PI;

    // Метод для деления двух целых чисел
    public static int divide(int a, int b) {
        return a / b;
    }

    // Метод для деления двух чисел с плавающей точкой
    public static double divide(double a, double b) {
        return a / b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double lengthCircle(int radius) {
        return 2 * PI * radius;
    }

    public static double squareCircle(int radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        int radius = 5;
        System.out.println("Длина окружности радиусом " + radius + " равна " + Calculator.lengthCircle(radius));
        System.out.println("Площадь окружности радиусом " + radius + " равна " + Calculator.squareCircle(radius));

    }
}