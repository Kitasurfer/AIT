package lesson_18.staticBlockDemo;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 07-10-2024
*/

public class InitExample {
    // Статическое поле массив строк
    static String[] colors;

    // Статическое поле счетчик
    static int counter = 1;

    // Приватные поля
    private String title = "Hello";
    private int capacity = 10;

    // статический блок инициализации вызывается один раз в момент загрузки класса JVM
    static {
        System.out.println("Static init block run!");
        colors = new String[3];

        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";

        counter = 10;  // Инициализация счетчика
    }

    // Конструктор
    public InitExample() {
        System.out.println("Constructor run!");
        this.title = "Constructor";
    }

    // Метод toString для вывода данных объекта
    public String toString() {
        return "title: " + title + ", capacity: " + capacity
                + ", static-counter: " + counter;
    }

    // Геттер для title
    public String getTitle() {
        return title;
    }

    // Статический метод для изменения цветов
    public static void changeColors(String color1, String color2) {
        if (colors != null && colors.length >= 2) {
            colors[0] = color1;
            colors[1] = color2;
        }
        System.out.println("Updated colors: " + java.util.Arrays.toString(colors));
    }
}
