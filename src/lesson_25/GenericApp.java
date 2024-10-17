package lesson_25;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 16-10-2024
*/

/*

 */
public class GenericApp {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        System.out.println(stringBox);

        stringBox.setValue("Hello World");
        System.out.println(stringBox);
        //GenericBox<String> stringBox2 = new GenericBox<>(25);

    }


}
