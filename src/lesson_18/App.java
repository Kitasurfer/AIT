package lesson_18.staticBlockDemo;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 07-10-2024
*/

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // Выводим значение статического поля counter
        System.out.printf("counter: " + InitExample.counter + "\n");

        // Выводим массив цветов
        System.out.printf(Arrays.toString(lesson_18.staticBlockDemo.InitExample.colors) + "\n");

        // Создаем объект InitExample
        InitExample initObject = new InitExample();

        // Выводим данные объекта через toString
        System.out.println(initObject.toString());

        // Изменяем цвета массива с помощью статического метода
        System.out.println(" \n =================================");
        InitExample.changeColors("yellow", "purple");

        // Снова выводим массив цветов после изменений
        System.out.printf(Arrays.toString(lesson_18.staticBlockDemo.InitExample.colors) + "\n");
    }
}
