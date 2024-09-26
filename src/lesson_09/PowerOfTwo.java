package lesson_09;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 22-09-2024
*/

/*

 */
public class PowerOfTwo {
    public static void main(String[] args) {
        power(2, 3); // Вызов метода для возведения числа 4 в степень 5
    }

    // Метод для возведения base (основание) в степень exponent (степень)
    public static void power(int base, int exponent) {
        int result = 1; // Начальное значение для результата

        // Используем цикл для возведения base в указанную степень
        for (int i = 1; i <= exponent; i++) {
            result = result * base; // Умножаем результат на base на каждом шаге
        }

        // Выводим результат на экран
        System.out.println(base + " в степени " + exponent + " равно " + result);
    }
}