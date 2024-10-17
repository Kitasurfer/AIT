package homework_26.task_3;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 17-10-2024
*/

import java.math.BigDecimal;
import java.math.BigInteger;

/*
Task3 * Опционально
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
Copy

 */
public class NumericPair<T extends Number> {

    private T first;
    private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    double sum() {
        if (first instanceof BigDecimal || first instanceof BigInteger) {
            BigDecimal a = (BigDecimal) first;
            BigDecimal b = (BigDecimal) second;
            return (a.add(b)).doubleValue();
        }
        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {
        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0



        NumericPair<BigDecimal> a = new NumericPair(3000000000000000L, 4);
        var c = a.sum();
        System.out.println(c);


    }

}
