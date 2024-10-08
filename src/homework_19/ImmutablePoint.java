package homework_19;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 08-10-2024
*/

/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */
public class ImmutablePoint {
    final int x;
    final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    /*
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    Причина, по которой эти методы не работают:
    Поля x и y объявлены как final у типа int.
    После их инициализации в конструкторе они не могут быть изменены.
    Попытка изменить значение вызывает ошибку.

    */

    public void printMessage(final String message) {
        // message = "new message";
        System.out.println(message);
    }
}