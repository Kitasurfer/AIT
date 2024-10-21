package homework_28;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 21-10-2024
*/

import lists.MyArrayList;
import lists.MyList;

/*

 */
public class RectangleUtils {

    public static MyList<Rectangle> removeDuplicates(MyList<Rectangle> rectangleList, Rectangle rectangle) {
        MyList<Rectangle> result = new MyArrayList<>();
        for (Rectangle rect : rectangleList) {
            if (!rect.equals(rectangle)) {
                result.add(rect);
            }
        }
        return result;
    }


}
