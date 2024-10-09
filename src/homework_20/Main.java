package homework_20;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 09-10-2024
*/

/*

 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle");
        rectangle.setDimensions(2.0, 3.0);
        System.out.println(rectangle.getName() + ": square -> " + rectangle.calculateArea());

        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setRadius(5.0);
        System.out.println(circle.getName() + ": square -> " + circle.calculateArea());


    }

}
