package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

public class Block {
    public static void main(String[] args) {
        // Ваш код здесь
        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x: " + x);
            System.out.println("y: " + x);
        }
    }
}
