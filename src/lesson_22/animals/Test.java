package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Test {
    private String title;

    // Конструктор, который принимает значение title
    public Test(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Test: title=" + title;
    }
}
