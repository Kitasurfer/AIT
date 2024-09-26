package lesson_06;
/*
Task 1
Дан текст Programming is fun.
Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, 
и выведите результат в виде булевой переменной.
 */
public class HomeWork_06_011 {
    public static void main(String[] args) {
        String text = "Programming is fun: ";

        boolean containsFun = text.contains("fun");
        System.out.println("Содержит ли строка  'fun' " + containsFun);
    }
}
/*
Содержит ли строка  'fun' true
 */