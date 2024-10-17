package homework_26.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH

Author: Bogdan Fesenko
Date: 17-10-2024
*/

import lists.MyArrayList; // Импортируем пользовательский класс MyArrayList

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”

Напишите обобщенный статический метод printTwoLists, который принимает два параметра
типа T и U, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.

Пример использования:
MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);

// Вывод:
// Alice
// Bob
// 85
// 92
 */
public class Task2 {

    // Обобщенный метод для вывода элементов двух списков
    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        // Выводим элементы первого списка
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // Выводим элементы второго списка
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public static void main(String[] args) {
        // Создаем список строк
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // Создаем список целых чисел
        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        // Вызываем метод для печати двух списков
        Task2.printTwoLists(names, scores);
    }
}
