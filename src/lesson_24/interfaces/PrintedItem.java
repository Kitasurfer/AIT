package lesson_24.interfaces;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 15-10-2024
*/

/*

 */


public abstract class PrintedItem implements Printable {
    String title;

    public PrintedItem(String title) {
        this.title = title;
    }

    // Абстрактный метод, который нужно реализовать в подклассах
    public abstract void print();
}