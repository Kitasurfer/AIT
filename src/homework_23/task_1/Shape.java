package homework_23.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
abstract class Shape {
    abstract double area(); // Абстрактный метод для вычисления площади

    abstract double perimeter();// Абстрактный метод для вычисления периметра
}
