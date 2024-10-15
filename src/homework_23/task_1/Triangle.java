package homework_23.task_1;

public class Triangle extends Shape {

    private double a, b, c; // Стороны треугольника
    private boolean valid = true; // Флаг для проверки корректности треугольника

    // Конструктор, принимающий стороны треугольника
    public Triangle(double a, double b, double c) {
        if (!isValidSides(a, b, c)) {
            System.out.println("Треугольник с такими сторонами не существует. Исправьте.");
            valid = false; // Устанавливаем флаг в false, если треугольник некорректен
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = "Triangle";
    }

    // Метод для проверки сторон треугольника на существование
    private boolean isValidSides(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    // Метод для вычисления полупериметра
    private double semiPerimeter() {
        return (a + b + c) / 2;
    }

    @Override
    double area() {
        if (!valid) {
            return 0; // Если треугольник некорректен, возвращаем 0
        }
        double s = semiPerimeter();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        if (!valid) {
            return 0; // Если треугольник некорректен, возвращаем 0
        }
        return this.a + this.b + this.c;
    }
}
