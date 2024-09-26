package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 19-09-2024
*/

public class HomeWork_08_3_1 {
    public static void main(String[] args) {
        int start = 1;
        int stop = 100;
        int count = 0;

        System.out.print("Числа которые / на 5: ");
        while (start <= stop && count < 7) {
            if (start % 5 == 0) {
                System.out.print(" " + start);
                count++;
            }
            start++;


        }
    }

}
