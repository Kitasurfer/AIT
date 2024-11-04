package lesson_29.iterator;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 22-10-2024
*/

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;


public class ForEachExample {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        // Цикл for-each

        while (iterator.hasNext()) {
            String s = iterator.next();
        }

        /*
        for (ТипПеременной переменная : коллекция) {
            // Действия с переменной
        }
         */
        // Цикл for-each  нет должен изменять состояние коллекции или удалять элементы
        for (String s : list){
            if (s.equals("Word")) {
                list.remove(s);
                list.add("JS");
            }

            System.out.println(s);
        }



    }
}