package homework_22.task3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Task 3 опционально
Фигуры и их площади
Создайте класс Фигура с методом рассчитать Площадь().
Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).
В главном классе создайте список фигур и вычислите площадь каждой из них.
 */
public class task3 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5), // Создаем круг с радиусом
                new Square(3),  // Создаем квадрат со стороной
                new Triangle(3, 20) // Создаем треугольник с основанием и высотой
        };
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + ": площадь = " + shape.area() + " см\u00B2"); // см²
        }


    }

}
