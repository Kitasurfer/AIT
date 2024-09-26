package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {

        // Сравнение на равенство
        boolean boll = true;
        boll = false;

        int x = 10;
        int y = 5;

        // X равен Y
        boolean b1 = x == y;
        System.out.println(x + " == " + y + " -> " + b1);  // Проверка на равенство

        // X не равен Y
        b1 = x != y; // Переменная b2,
        System.out.println(x + " != " + y + " -> " + b1);  // Проверка на неравенство

        // Больше > X больше чем Y
        b1 = x > y;
        System.out.println(x + " > " + y + " -> " + b1);   // Проверка на больше

        y = 10;
        b1 = x > y;  // Сравнение x и y после изменения значения y
        System.out.println(x + " > " + y + " -> " + b1);   // Вывод, когда y равно 10

        // Больше или равно ">="
        b1 = x >= y;  // 10 больше или равно 10 -> true
        System.out.println(x + " >= " + y + " -> " + b1);

        x = 7;
        // Меньше "<"
        b1 = x < y;   // 7 меньше чем 10 -> true
        System.out.println(x + " < " + y + " -> " + b1);

        // Меньше или равно "<="
        b1 = x <= y;  // 7 меньше или равно 10 -> true
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best.";
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"): " + contains);

        System.out.println("=================== Логические операции =========== \n");

        // Логическое НЕ (отрицание): меняет значение boolean на противоположное
        boolean b2;
        b2 = !false; // получим значение true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);


        // Составные сравнения два условия
        // Логическое И "&"
        // Используется Когда нужно, чтобы условия были истинными
        // Рим столица Италии Берлин столица Голландии
        // Если хотя бы в одной части будет фоллс мы получим Фоллс

        b2 = true & true;
        System.out.println("true & true: " + b2);

        b2 = (2 < 5) & (11 == 10);
        System.out.println("(2 < 5) & (11 == 10); -> " + b2);

        // Логическая или когда достаточно чтобы хотя быОдно условие Было истинным

        boolean b4 = true | false;
        System.out.println("true | false; -> " + b4);
        System.out.println("true | false; ->" + (true | false));

        // Введите четное число или число которое делится на пять без остатка
        // Четное число которое делится без остатка на 2
        // Генерации случайного числа
        Random random = new Random();
        int rand = random.nextInt(100); // (0...x-1) -> (0...99) включительно
        System.out.println("rand:" + rand);
        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        boolean b5 = true ^ false;
        System.out.println("true ^ false: " + b5);





    }
}
