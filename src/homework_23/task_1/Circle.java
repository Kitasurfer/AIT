package homework_23.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*
Класс Circle наследует абстрактный класс Shape.
   Вычисляет площадь и периметр круга.
 */
public class Circle extends Shape {
    private final double radius; // радиус


    public Circle(double radius) { // Конструктор принимает радиус
        this.radius = radius;
        this.type = "Circle";
    }

    @Override
    double area() { // Вычисляем площадь круга
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double perimeter() { // Вычисляем периметр круга
        return 2 * Math.PI * this.radius;
    }
}
