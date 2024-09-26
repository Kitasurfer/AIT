package lesson_06;

import java.util.Random;

/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.
 */
public class HomeWork_06_022 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(51);
        int b = random.nextInt(101);

        System.out.println("a " + a);
        System.out.println("b " + b);

        boolean areEqual = a == b; // Проверяем равенство
        System.out.println("Переменные равны: " + areEqual);

        // Проверка неравенства
        boolean areNotEqual = a != b;
        System.out.println("Переменные не равны: " + areNotEqual);

        // Проверка больше ли a чем b
        boolean isAGreaterThanB = a > b;
        System.out.println("a больше, чем b: " + isAGreaterThanB);

        // Проверяем меньше ли b чем a
        boolean isBLessThanA = b < a;
        System.out.println("b меньше, чем a: " + isBLessThanA);


    }
}
