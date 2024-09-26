package lesson_09;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 20-09-2024
*/

public class TernarOperator {
    public static void main(String[] args) {
        int x = 195;

        String result;

        if (x >= 0) {
            result = "pozitiv";
        } else {
            result = "otrizatelnoe";
        }

        String res1 = (x >= 0) ? "pozitiv" : "negativ";
        System.out.println("Number " + result);
        System.out.println("Number " + res1);

    }

}
