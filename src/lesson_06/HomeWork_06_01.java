package lesson_06;
/*
Task 1
Необходимо написать программу, которая предлагает пользователю
ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь:
Один, Два, или Три (текстом)
 */

import java.util.Scanner;

public class HomeWork_06_01 {
    public static void main(String[] args) {

        String message = "Введите число 1, 2 или 3";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3: ");
        String defmessage = "Вы ввели неверное значение!: ";

        while (true) {
            int num = scanner.nextInt();

            /*
             switch (num): Этот блок проверяет значение переменной num.
             В зависимости от того, какое число ввел пользователь, выполняется
             соответствующая ветка.
             */
            String result = switch (num) {
                case (1) -> "Один";
                case (2) -> "Два";
                case (3) -> "Три";
                default -> defmessage;
            };
            System.out.println(result);

        }
    }
}
/*
Введите число 1, 2 или 3:
1
Один
4
Введите число 1, 2 или 3
3
Три
2
Два
 */
