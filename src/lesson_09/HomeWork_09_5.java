package lesson_09;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 21-09-2024
*/

/*
Task 5
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */
public class HomeWork_09_5 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty", "Seventy"};  // Входной массив строк
        printLongestStringCharacters(array);  // Это вызов метода printLongestStringCharacters,
                                            // который принимает массив array в качестве аргумента.
    }

    // printLongestStringCharacters - Этот метод будет искать самую длинную строку и выводить её символы.
    private static void printLongestStringCharacters(String[] array) { // String[] array — это параметр метода который принимает массив строк.
        if (array == null || array.length == 0) { // array == null — проверяет, был ли создан массив.
            // || (или) array.length == 0 — проверяет, пуст ли массив (если его длина равна 0)
            System.out.println("Массив пуст или не задан."); // строка, которая будет выведена, если условие окажется истинным.
            return; // прерывает выполнение метода и выходит из него
        }


        String longestString = array[0]; // longestString — имя переменной, в которую мы будем
        // сохранять самую длинную строку.

        // Поиск самой длинной строки в массиве
        for (String str : array) {
            if (str.length() > longestString.length()) {
                longestString = str;  // Здесь обновляем значение самой длинной строки
            }
        }

        // Вывод символов самой длинной строки по одному на каждой строке
        for (char c : longestString.toCharArray()) { // (char c - "этот тип данных означает "символ"")
            // — каждый символ строки будет переменной c.
            System.out.println(c); // c-символ который мы выводим на отдельной строке.
        }
    }
}
