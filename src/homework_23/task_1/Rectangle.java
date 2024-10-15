package homework_23.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*
Класс Rectangle наследует абстр Shape, рассчитывает площадь и периметр прямоугольника
 */
public class Rectangle extends Shape {
    private double a; // Длинна стороны а
    private double b;// Длинна стороны b


    public Rectangle(double a, double b) {
        this.a = a; // Конструктор принимает стороны
        this.b = b;
        this.type = "Rectangle";
    }

    @Override
    double area() { // Формула площади
        return this.a * this.b;
    }

    @Override
    double perimeter() { // Вычисляем периметр
        return 2 * (a + b);
    }
}
