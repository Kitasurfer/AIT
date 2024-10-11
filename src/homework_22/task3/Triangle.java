package homework_22.task3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Triangle extends Shape{

    private final int a;
    private final int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {

        // double p = (a + b + c) / 2;
        // double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return 0.5 * this.a * this.b;
    }
}
