package homework_26.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 17-10-2024
*/

/*
Task 0
У вас должен быть в проекте рабочий вариант обобщенного (с дженериком)
класса MagicArray.
Мы будем активно пользоваться объектами этого класса. В том числе и
при работе над мини-проектом в командах.
 */
public class MagicArray<T> {
    T[] array;
    int cursor; // присвоено значение по умолчанию = 0;

    public MagicArray() {
        this.array = (T[]) new Object[10];
    }

    // Добавление в массив одного элемента
    void add (T value) {

        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length -1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;

    }

    void add(T... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }


    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            System.out.println("индекс \"не корректный\"");
            return null;
        }
        // Написать код, если индекс "не корректный"
         // Хорошего решения нет.
        //Todo Поправить обработку не корректного индекса
    }

    // Удаление элемента по индексу
    T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */
        //Todo реализовать
        if (this.cursor < 0 || this.cursor > array.length - 1) {
            return null;
        } else {
            T oldValue = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return oldValue;
        }

    }

    public static void main(String[] args) {
        MagicArray<Integer> list = new MagicArray<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        System.out.println(list.size());
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println(list.size());


    }




}

/*
1. Добавлять в массив элемент (не думая об индексах, размере массива)
2. Динамическое изменение размера массива
3. Возвращать строковое представление массива (какие элементы тым есть)
4. Добавляем в массив сразу несколько значений.
5. Текущее количество элементов в массиве
6. Возвращает значение по индексу
7. Удаляет элемент по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)

 */