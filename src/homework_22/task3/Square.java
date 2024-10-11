package homework_22.task3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Square extends Shape{

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }
}
