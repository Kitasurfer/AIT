package homework_20;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 09-10-2024
*/

/*

 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }
}
