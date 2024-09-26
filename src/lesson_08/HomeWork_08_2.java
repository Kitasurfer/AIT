package lesson_08;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 19-09-2024
*/
/*
Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class HomeWork_08_2 {
    public static void main(String[] args) {

        int start = 1;
        int stop = 10;

        while (start <= stop) {
            System.out.println("Task" + start);
            start++;
        }

    }

}
