package lesson_04;

/*
Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
 */
public class HomeWork_04_1 {
    public static void main(String[] args) {

        int myInt = 10; // Объявляет переменную типа int и присваивает ей значение 10.
        double myDouble = myInt; // Присваивает значение этой переменной в переменную типа double с именем myDouble.


        System.out.printf("myDouble " + myDouble); // Выводим на экран


    }
}
