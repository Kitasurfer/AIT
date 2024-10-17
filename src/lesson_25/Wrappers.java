package lesson_25;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 16-10-2024
*/

/* Java для представления примитивных данных типа данных как объект
Byte -> обертка byte
Short -> обертка для short
Integer -> обертка для int
Long -> обертка для long
Float -> float
Double - double
Character -> char
Boolean -> boolean
 */
public class Wrappers {
    public static void main(String[] args) {

        // Автоматическое приведение типов и автоупаковка и автораспаковка

        Integer wrapperInt = 5; // авто упаковка int в ссылочной тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка из типа Integer автоматически преобразовало в примитив int.

        // Сравнение объектов
        Integer a = 127;
        Integer b = 127;
        // Так как это ссылочный тип данных оператором == сравниваются ссылки
        System.out.println("a == b -> " + (a == b)); // true
        System.out.println("a.equals(b) " + a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false
        System.out.println(a.equals(d));

        String j1 = "Java";
        String j2 = "Java";
        System.out.println("j1 == j2 -> " + (j1 == j2)); // true, т.к. строки находятся в строковом пуле

        String j3 = new String("Java");
        System.out.println("j2 == j3 -> " + (j2 == j3)); // false, так как это разные объекты
        System.out.println("j3.equals(j2) " + j3.equals(j2));

        System.out.println("\n==================\n");
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue); // выводит максимальное значение

        System.out.println("min: " + Integer.MIN_VALUE); // выводит минимальное значение


        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println(e == f);

        Integer intStr = Integer.valueOf("123"); // передаем строку превращаем в цифры
        System.out.println(intStr + 100); // и складываем

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        // 2. parseXXX() - преобразует строку в соответствующий примитив
        System.out.println(Integer.parseInt("456") + 100);
        Double d1 = Double.parseDouble("345.54 ") ;
        Double result = d1 + 200;
        System.out.println("d1 " + result);


    }
}


