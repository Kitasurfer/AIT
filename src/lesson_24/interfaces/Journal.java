package lesson_24.interfaces;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 15-10-2024
*/

/*

 */
public class Journal extends PrintedItem {
    int number;

    public Journal(String title, int number) {
        super(title);
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("Journal '%s', Issue #%d.\n", title, number);
    }
}
