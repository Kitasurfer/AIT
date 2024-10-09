package lesson_20;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 09-10-2024
*/

import java.util.Arrays;
import java.util.Scanner;

/*

 */
public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java " + "is" + " " + "the" + " " + "best";

        /** StringBuilder - это класс в Java, предназначены для эффективного создания и модификации изменения их
        последовательности символов.
         В Java StringBuilder — это класс, который используется для создания и изменения строк. Он является изменяемым
         (в отличие от строк класса String, которые неизменяемы) и позволяет эффективно работать с динамически
         изменяемыми строками без создания новых объектов при каждой модификации строки.

         Вот основные особенности и преимущества StringBuilder:

         Изменяемость: Вы можете изменять строку (добавлять символы, удалять, заменять) без создания нового объекта
         строки. Это экономит память и время, особенно при частых модификациях строки.
         Быстродействие: В отличие от String, каждая операция с StringBuilder не создает новую строку в памяти,
         что делает его быстрее при изменении строки.
         Методы для работы со строками:
         @append(): Добавляет строку или другой объект (например, число) к существующей строке.
         @insert(): Вставляет строку в определенное место внутри строки.
         @delete(): Удаляет часть строки.
         @reverse(): Разворачивает строку.
         @replace(): Заменяет часть строки на другую.
         @toString(): Преобразует содержимое StringBuilder обратно в объект String.*/

       /* StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!" + "a2");  // Добавляем строку " World!"
        System.out.println(sb.toString());  // Выводим итоговую строку
        sb.insert(6, "Beautiful ");  // Вставляем строку "Beautiful " на 6 позицию
        System.out.println(sb.toString());  // Выводим итоговую строку
        sb.delete(6, 16);  // Удаляем часть строки с 6 по 16 символ (удаляется "Beautiful ")
        System.out.println(sb.toString());  // Выводим итоговую строку
        sb.reverse();  // Разворачиваем строку
        System.out.println(sb.toString());  // Выводим итоговую строку*/


        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");

        // Метод для добавления в конец строки (приклеить справа) / аналог конкатенации
        sb.append(" ").append("Java");

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        //  Вставить символы в указанную позицию
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        // Заменить подстроку (определяется индексами) на указанное значение
        StringBuilder sb3 = new StringBuilder("Hello World!");
        sb3.replace(6, 11, "Java"); // верхняя граница не включительно
        System.out.println(sb3);

        // Удалить подстроку в диапазоне от start до end
        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.delete(5, 11);
        System.out.println(sb4);

        // Реверс - Разворачивает последовательность символов
        StringBuilder sb5 = new StringBuilder("Hello World!");
        sb5.reverse();
        System.out.println(sb5);

        // Количество символ - длина
        System.out.println("sb5.length(): " + sb5.length());

        // Получить символ по индексу
        char ch = sb5.charAt(3);
        System.out.println(ch);

        // Получить подстроку
        sb = new StringBuilder("Hello World");
        String subString = sb.substring(1); // от индекса до конца строки
        System.out.println("sb.substring(1): " + subString);

        subString = sb.substring(6, 9); // от start до end (не включительно)
        System.out.println("sb.substring(6, 9): " + subString);

        // Изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println("sb.setLength(10): " + sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8): " +  (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb);

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанных в верхнем регистре)
         */
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] strings = example.split(" ");
        System.out.println(Arrays.toString(strings));

        String result = phraseString();
        System.out.println("Аббревиатура: " + result);

        // Потоко-безопасный брат StringBuilder
        StringBuffer stringBuffer = new StringBuffer();


    }

    public static String phraseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");

        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        // String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // result = result + word.charAt(0);
            sb.append(word.charAt(0));
        }

        // System.out.println("Результирующая строка: " + result.toUpperCase());

        return sb.toString().toUpperCase();
    }
}
