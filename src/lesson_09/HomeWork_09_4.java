package lesson_09;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 20-09-2024
*/
/*
Task4 * (опционально)
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
 */
public class HomeWork_09_4 {
    public static void main(String[] args) {

        // Цикл отвечает за количество строк от 1 до 6
        for (int i = 1; i <= 6; i++) {
            // Этот цикл внутри первого выводит цифры в Каждой строке от 1 до i
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Вывод цифры до срабатывания условия j <= i в одной строке
            }
            System.out.println(); // Переводит на новую строку когда сработала верхняя строка
        }
    }
}
