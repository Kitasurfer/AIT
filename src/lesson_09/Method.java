package lesson_09; /* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 20-09-2024
*/

public class Method {
    public static void main(String[] args) {

        System.out.println("===================================\n");

        // Вызов метода, который выводит на экран числа от 1 до N
        printNumbers(10);

        // Создание массива
        int[] array = {1, 45, 76, 54, 90, 435, 0, 45};

        // Вывод массива
        printArray(array);

        int[] array2 = {1, 45, 76, 54, 90, 435, 0, 45555};
        printArray(array2);

        // Изменение значений в массиве
        array[0] = -100000;
        array[3] = 1010101010;

        // Вызов метода sayHello три раза
        sayHello();
        sayHello();
        sayHello();

        // Создание строки и вывод
        String string = "Java";
        System.out.println(string);

        // Вызов метода saySomething
        saySomething("Java2");
        saySomething("Java3");

        // Инициализация символа
        char ch = 'A';
        printDecimalCodeChar(ch); // Вызов метода для вывода десятичного кода символа

        // Вызов метода для вывода измененного массива
        printArray(array);
    } // End main

    // Метод для вывода чисел от 1 до N
    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i + (i < n ? ", " : "\n"));
            i++;
        }
    }

    // Метод для вывода десятичного кода символа
    public static void printDecimalCodeChar(char ch) {
        System.out.println((int) ch);
    }

    // Метод для вывода строки
    public static void saySomething(String text) {
        System.out.println(text);
    }

    // Метод для вывода "Hello!"
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // Метод для вывода элементов массива с форматированием
    public static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }
}
