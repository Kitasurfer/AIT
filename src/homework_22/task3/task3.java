package homework_22.task3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class task3 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(3),
                new Triangle(3,20)
        };
        for (Shape shape : shapes) {
            System.out.println("Shape " + shape.area());
        }


    }

}
