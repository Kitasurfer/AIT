package homework_26.task_3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 17-10-2024
*/

import java.math.BigDecimal;
import java.math.BigInteger;

/*
Task 3 * Опционально
Обобщенный класс с ограничениями типов

Описание:
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.

Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */
public class NumericPair<T extends Number> {

    private T first;
    private T second;

    // Конструктор для инициализации пары чисел
    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Метод для вычисления суммы двух чисел
    double sum() {
        // Если числа — это BigDecimal или BigInteger, нужно использовать BigDecimal для точности
        if (first instanceof BigDecimal || first instanceof BigInteger) {
            BigDecimal a = new BigDecimal(first.toString());
            BigDecimal b = new BigDecimal(second.toString());
            return (a.add(b)).doubleValue(); // Возвращаем сумму как double
        }
        // Для остальных типов используем метод doubleValue()
        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {
        // Пример с целыми числами
        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        // Пример с числами с плавающей точкой
        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0

        // Пример с BigDecimal
        NumericPair<BigDecimal> bigDecimalPair = new NumericPair<>(new BigDecimal("3000000000000000"), new BigDecimal("4"));
        System.out.println(bigDecimalPair.sum()); // Вывод: 3000000000000004.0
    }
}
