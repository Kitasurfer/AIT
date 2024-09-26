package lesson_04;

import java.util.Arrays;

public class TypeCharExample {
    public static void main(String[] args) {

        // Разные способы присвоения символов типу char
        char a = 'A'; // Переменная будет хранить букву 'A' латинского алфавита
        char a1 = 65; // Юникод для буквы 'A' - 65
        char a2 = 0x41; // 16-ричное представление буквы 'A'
        a2 = 0x0041; // Полная запись числа в 16-ричной системе
        char a3 = '\u0041'; // Unicode символ 'A'
        char x = '\u1507'; // Произвольный символ с кодом 1507 в Unicode

        // Вывод символов
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        // Работа с числами и символами
        char digit0 = 48; // 48 соответствует символу '0' в таблице Unicode
        System.out.println("digit0 (as char): " + digit0);

        // Работа с переменной типа int
        int var = 5;
        System.out.println("var: " + var);

        // Пример работы с цифрами в формате символов
        digit0 = '5'; // Переменная хранит символ '5'
        digit0 += 5; // Увеличиваем символ на 5. Это преобразует '5' в символ 'A' (код 65)
        System.out.println("digit0 after adding 5: " + digit0);

        // Пример работы с буквами
        char letter = 97; // символ 'a' (код 97 в Unicode)
        System.out.println("letter: " + letter);
        letter++; // Увеличиваем значение на 1, получаем 'b' (код 98)
        System.out.println("letter after increment: " + letter);

        // Преобразование char в int для получения кода символа
        System.out.println("int из char даст код символа 'b': " + (int) letter);
        System.out.println("0 + letter: " + (0 + letter)); // Пример сложения символа и числа

        // Справка по кодам символов
        // 0...9 -> соответствуют кодам 48...57
        // a...z -> соответствуют кодам 97...122
        // A...Z -> соответствуют кодам 65...90


    }
}
