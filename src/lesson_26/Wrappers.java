package lesson_26;/* Group: 52-1, "AIT Hi-tech team" GMBH
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

        // Автоматическое приведение типов и авто упаковка и авто распаковка

        Integer wrapperInt = 5; // авто упаковка int в ссылочной тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Авто распаковка из типа Integer автоматически преобразовало в примитив int.

        Boolean boolWrapper = true; // авто упаковка
        boolWrapper = null; // У ссылочного Boolean появляется третье значение null

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
        double d1 = Double.parseDouble("345.54 ") + 200 ;
        System.out.println(d1);

        //3. toString -возвращает строгого представление числа
        System.out.println(doubleWrap);

        // 4. Сравнение объектов нормально обозначение
        Long l1 = Long.valueOf(200);
        l1 = 200L;
        System.out.println(l1.equals(200L));
        Integer i1 = 150;
        System.out.println(i1.equals(150));

        /*// 5. compareTo - сравнивая текущий объект другим объектам того же типа кто больше?
        250150 -> 1
        250500 -> -1
        250250 -> 0
        Метод compareTo() в Java используется для сравнения текущего объекта с другим объектом того же типа.
        Он возвращает одно из трех значений:

        0 — если объекты равны;
        Положительное значение (обычно 1) — если текущий объект больше переданного объекта;
        Отрицательное значение (обычно -1) — если текущий объект меньше переданного объекта.
        Это полезно для сортировки или просто сравнения значений в логических операциях.*/

        Integer iMax = 250; // Объект типа Integer с значением 250
        Integer iMin = 150;
        Integer iSuper = 500;
        System.out.println(iMax + "" + iMin +" -> " + iMax.compareTo(iMin));
        System.out.println(iMax + "" + iSuper +" -> " + iMax.compareTo(iSuper));
        System.out.println(iMax + "" + 250 +" -> " + iMax.compareTo(250));

        // xxxValue() - возвращает значение объекта виде примитивного типа
        // doubleValue
        Double d2 = Double.valueOf(125.56); // Явная / принудительная упаковка. Примитив -> в обертку
        double dPrimitive = d2.doubleValue(); // Явная / принудительно распаковка. Обертка -> примитив

        Integer integer = 31844;
        Double doubleVal = 235.35;

        System.out.println(integer.doubleValue());

        short shortPrimitive = integer.shortValue();








    }
}


