package homework_23.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*
Основной класс для работы с фигурами.
Создает массив объектов фигур и вычисляет их площадь и периметр.
 */
public class ShapeApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] { // массив фигур круг, прямоугольник, треугольник
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3,4,5)
        };

        double totalArea = 0; // Переменные для общей площади и периметра всех фигур
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area(); // Складываем площадь
            totalPerimeter += shape.perimeter(); // Складываем периметр
        }

        System.out.println("Общая площадь всех фигур: " + totalArea);
        System.out.println("Общий периметр всех фигур: " + totalPerimeter);

    }

}
