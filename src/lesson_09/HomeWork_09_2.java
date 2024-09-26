package lesson_09;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 22-09-2024
*/

/*
Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя;
 */
public class HomeWork_09_2 {
    public static void main(String[] args) {
      /*  power (2, 3);// Вызов метода для возведения в степень base (2), число 3 это степень
    }

    public static void power(int base, int exponent) {
        int result = 1; // начальное значение 1

        // Используем цикл for для возведения base в степень
        for (int i = 1; i <= exponent; i++) {
            result = result * base; // умножаем каждый результат na base
        }
        System.out.println(base + " в степени " + exponent + " равно " + result); // Вывод результата
        System.out.println(base + " ^ " + exponent + " = " + result); // Вывод результата красиво

    }
}

*/



                power(2, 3, true);  // Возведение в положительную степень
                power(2, 2, false); // Возведение в отрицательную степень
            }

            // Метод, принимающий boolean флаг для определения типа возведения в степень
            public static void power(int base, int exponent, boolean isPositive) {
                double result = 1;

                // Если флаг true, возводим в положительную степень
                if (isPositive) {
                    for (int i = 1; i <= exponent; i++) {
                        result *= base;
                    }
                } else {
                    // Если флаг false, возводим в отрицательную степень
                    for (int i = 1; i <= exponent; i++) {
                        result *= base;
                    }
                    result = 1.0 / result;
                }

                // Вывод результата
                String sign = isPositive ? "" : "-";
                System.out.println(base + " в степени " + sign + exponent + " равно " + result);
            }
        }
