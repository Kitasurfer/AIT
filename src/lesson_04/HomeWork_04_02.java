package lesson_04;

/*
Task 2
Явное преобразование double в int
Напишите программу, которая:

Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран.
 */
public class HomeWork_04_02 {
    public static void main(String[] args) {

        double myDouble = 5.99; // Объявляем переменную double с именем myDouble и присваивает ей значение 5.99.
        int myInt = (int) myDouble; // Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.

        System.out.println("myInt = " + myInt); // Выводит значение myInt на экран.



    }
}
