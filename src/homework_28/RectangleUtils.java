package homework_28;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 21-10-2024
*/

import lists.MyArrayList;
import lists.MyList;

public class RectangleUtils {

    // Метод для удаления дубликатов
    public static MyList<Rectangle> removeDuplicates(MyList<Rectangle> rectangleList) {
        MyList<Rectangle> result = new MyArrayList<>(); // Список для не дубликатов прямоугольников

        for (int i = 0; i < rectangleList.size(); i++) {
            Rectangle current = rectangleList.get(i);

            // Проверяем, есть ли такой элемент уже в новом списке
            if (!contains(result, current)) {
                result.add(current); // Если нет, добавляем его
            }
        }
        return result;
    }

    // Проверяем наличие объекта в списке
    private static boolean contains(MyList<Rectangle> list, Rectangle rectangle) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rectangle)) {
                return true; // Прямоугольник найден в списке
            }
        }
        return false; // Прямоугольник не найден в списке
    }
}
