package lesson_25;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 16-10-2024
*/

/*

 */
public class SimpleApp {
    public static void main(String[] args) {

        SimpleBox box = new SimpleBox(10);
        System.out.println(box);

        SimpleBox box1 = new SimpleBox(20);
        System.out.println(box1);

        int sum = (int) box.getValue()
                + (int) box1.getValue();
        System.out.println("sum: " + sum);

        SimpleBox[] bexes = new SimpleBox[3];
        bexes[0] = box;
        bexes[1] = box1;
        bexes[2] = new SimpleBox(30);

        int sum1 = 0;
        for (int i = 0; i <= bexes.length; i++) {
            sum1+= (int) bexes[i].getValue();

        }

        System.out.println("sum1: " + sum1);
    }
}
