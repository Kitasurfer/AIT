package homework_28;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 21-10-2024
*/

import lists.MyArrayList;
import lists.MyList;

public class RectangleApp {

    public static void main(String[] args) {
        MyList<Rectangle> rectangles = createRectangleList();

        System.out.println("Список до удаления дубликатов:");
        printRectangles(rectangles);

        MyList<Rectangle> uniqueRectangles = RectangleUtils.removeDuplicates(rectangles);

        System.out.println("\nСписок после удаления дубликатов:");
        printRectangles(uniqueRectangles);
    }

    private static MyList<Rectangle> createRectangleList() {
        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        return rectangles;
    }

    private static void printRectangles(MyList<Rectangle> rectangles) {
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }
}
