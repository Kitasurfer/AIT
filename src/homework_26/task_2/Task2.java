package homework_26.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH

import list.MyArrayList;

Author: Bogdan Fesenko
Date: 17-10-2024
*/

import lists.MyArrayList;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра
типа  и , и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
Пример использования:
<String> names = new <>();
names.add("Alice");
names.add("Bob");

<Integer> scores = new <>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
Copy
// Вывод:
// Alice
// Bob
// 85
// 92
 */
public class Task2 {

    public static <T,U> void printTwoLists(MyArrayList<T> list1,
                                           MyArrayList<U> list2) {
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        Task2.printTwoLists(names,scores);
    }


}
