package homework_23.task_1;

public class ShapeApp {

    public static void main(String[] args) {
        // Создаем массив объектов фигур
        Shape[] shapes = new Shape[] {
                new Circle(5),           // Круг с радиусом 5
                new Rectangle(4, 6),      // Прямоугольник 4x6
                new Triangle(2, 4, 3)    // Некорректный треугольник
        };

        // Переменные для хранения общей площади и периметра всех фигур
        double totalArea = 0;
        double totalPerimeter = 0;

        // Цикл по всем фигурам
        for (Shape shape : shapes) {
            // Вычисляем площадь и периметр для каждой фигуры
            double area = shape.area();
            double perimeter = shape.perimeter();

            // Определяем тип фигуры (можно добавить метод getType() в каждом классе)
            if (shape instanceof Circle) {
                System.out.println(shape.type + ": Площадь = " + area + ", Периметр = " + perimeter);
            } else if (shape instanceof Rectangle) {
                System.out.println(shape.type + ": Площадь = " + area + ", Периметр = " + perimeter);
            } else if (shape instanceof Triangle) {
                System.out.println(shape.type + ": Площадь = " + area + ", Периметр = " + perimeter);
            }

            // Суммируем площади и периметры
            totalArea += area;
            totalPerimeter += perimeter;
        }

        // Вывод общей площади и периметра всех фигур
        System.out.println("\nОбщая площадь всех фигур: " + totalArea);
        System.out.println("Общий периметр всех фигур: " + totalPerimeter);
    }
}
