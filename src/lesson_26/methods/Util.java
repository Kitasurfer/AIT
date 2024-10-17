package lesson_26.methods;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 17-10-2024
*/

import lists.MyArrayList;

/*

*/
public class Util {




    public static <T> String printArray(T[] array) {
        if (array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(i < array.length - 1 ? ", " : "]");
        }

        return sb.toString();

    }



    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();  // Преобразование каждого элемента в тип double
        }

        return sum;
    }

    // extends  Number - мы работаем с неизвестным типом, который является наследником
    // Метод принимает MyArrayList только с элементами типа number или его наследниками
    public static double listSum(MyArrayList<? extends  Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();

        }
        return  sum;


    }

}