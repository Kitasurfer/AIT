package lesson_26.methods;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 17-10-2024
*/

/*

 */
public class MethodApp {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        String[] strings = {"Hello", "World", "Java"};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println(Util.printArray(array));
        System.out.println(Util.printArray(strings));
        System.out.println(Util.printArray(doubles));

        Util.swap(strings, 0, 2);
        System.out.println(Util.printArray(strings));
        System.out.println(Util.sum(doubles));
    }
}
