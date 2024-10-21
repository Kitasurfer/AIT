package homework_28;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 21-10-2024
*/

import lists.MyArrayList; // Импорт класса MyArrayList
import lists.MyList; // Импорт интерфейса MyList

import java.util.ArrayList; // Импорт стандартного класса ArrayList (не используется, можно удалить)

import static homework_28.RectangleUtils.removeDuplicates; // Статический импорт метода removeDuplicates из класса RectangleUtils

/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

    - length (длина) — тип double
    - width (ширина) — тип double
Требования:
Конструкторы:
   - Создайте конструктор, который инициализирует оба поля класса.
   - Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.
Методы:
   - Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
   - Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате:
   "Прямоугольник [длина=..., ширина=...]".
Метод main():
   - В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().
 */
public class Rectangle {
    // Поля класса
    private double length;
    private double width;

    // Конструктор, инициализирующий оба поля
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Конструктор по умолчанию, устанавливающий длину и ширину в 1.0
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Геттеры и сеттеры для полей length и width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Переопределение метода toString() для представления объекта в виде строки
    @Override
    public String toString() {
        return "Прямоугольник [длина=" + length + ", ширина=" + width + "]";
    }

    // Переопределение метода equals() для сравнения объектов по длине и ширине
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;

        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    // Переопределение метода hashCode() для корректной работы с хэш-таблицами
    @Override
    public int hashCode() {
        int result = Double.hashCode(length);
        result = 31 * result + Double.hashCode(width);
        return result;
    }

    public static void main(String[] args) {
        // Создание списка прямоугольников с использованием MyArrayList
        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        // Вывод списка до удаления дубликатов
        System.out.println("Список до удаления дубликатов:");

        // Простой цикл for для вывода каждого объекта
        for (Rectangle rect : rectangles) {
            System.out.println(rect); // Вывод информации о прямоугольнике
        }

        // Создание прямоугольника, который нужно удалить
        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);

        // Вызов метода removeDuplicates для удаления всех дубликатов объекта rectangleToRemove
        MyList<Rectangle> updatedList = removeDuplicates(rectangles, rectangleToRemove);

        // Вывод списка после удаления дубликатов
        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : updatedList) {
            System.out.println(rect); // Вывод информации о прямоугольнике
        }
    }
}
