package lesson_16; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 01-10-2024
*/

/*

 */
public class TestArray {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);
        magicArray.add(500, 600, 800, 1100);


        // Печатаем массив после добавления элементов
        System.out.println(magicArray);
    }
}
