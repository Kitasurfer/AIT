package lesson_06;

/*
Task 4
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
import java.util.Scanner;

public class HomeWork_06_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "Введите целое число";

        System.out.println(message);
        while (true) {
            int num = scanner.nextInt();
            boolean isEven = num % 2 == 0; // проверяет четное ли, делится ли число на 2 без остатка.
            boolean isMultiple = num % 3 == 0; // проверяет, делится ли число на 3 без остатка.
            System.out.println("Число: " + num + " четное: " + isEven + ";" +
                    " кратно 3: " + isMultiple + ";" +
                    " четное и кратное 3: " + (isEven && isMultiple));
            // Выводим результаты проверок с помощью printf
            System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s\n", num, isEven, isMultiple, (isEven && isMultiple));

            // Демонстрация использования print и println
            System.out.println("Test");
            System.out.print("1");
            System.out.print("2");
            System.out.print("3");
            // логический оператор &&, который возвращает true, если оба условия (четность и кратность 3) выполняются.
        }
    }
}
