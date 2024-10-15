package lesson_24.interfaces;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 15-10-2024
*/

/*

 */
public class Book extends PrintedItem {
    String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book '%s' author %s.\n", title, author);
    }
}
