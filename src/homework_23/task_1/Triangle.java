package homework_23.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*
Используется для вычисления площади и периметра треугольника.
*/
public class Triangle extends Shape {

    private double a, b, c; // стороны треугольника

    public Triangle(double a, double b, double c) { // Конструктор принимающий его стороны
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double semiPerimeter() { // Метод для вычисления полупериметра
        return (a + b + c) / 2;
    }


    @Override
    double area() { // Вычисляем площадь
        double semiPerimeter = (this.a + this.b + this.c) * 0.5;
        // Формула Герона для площади
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.a) * (semiPerimeter - this.b) * (semiPerimeter - this.c));
    }

    @Override
    double perimeter() { // Вычисляем периметр треугольника
        return this.a + this.b + this.c;
    }


}
