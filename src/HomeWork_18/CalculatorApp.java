package HomeWork_18; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 08-10-2024
*/

public class CalculatorApp {
    public static void main(String[] args) {
        int div = Calculator.divide(15, 3); // убрал 'a:' и 'b:', так как это не синтаксис Java
        System.out.println("div: " + div);

        double divDouble = Calculator.divide(10.0, 4); // убрал 'a:' и 'b:'
        System.out.println("divDouble: " + divDouble);
    }
}

class Calculator {
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
}
