package lesson_16;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 02-10-2024
*/

/*
Task 0
Повторить код, написанный на уроке

В MagicArray должны быть реализованы методы:

Добавление элемента
Вывести все значения в массиве в консоль
Поиск элемента по значению indexOf - (вернуть индекс, если такое значение есть в массиве)
Возвращение значения по индексу
Текущее количество элементов в массиве
Удаление элемента по индексу remove
Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
Конструктор, принимающий в себя обычный массив и создающий MagicArray с такими де значениями
Удаление элемента по значению
 */


public class MagicArray {
    int[] array; // Внутренний массив для хранения значений
    int cursor;  // Текущая позиция для добавления элемента, по умолчанию = 0

    // Конструктор для инициализации массива с размером 10
    public MagicArray() {
        array = new int[10];
    }

    // Добавление одного элемента в массив
    void add(int value) {
        if (cursor == array.length) { // Проверяем, есть ли свободное место в массиве
            // Заменяем проверку на cursor == array.length, эта проверка будет корректно расширять массив только тогда,
            // когда все места в нем заполнены, если -1, то будет раньше расширять массив.
            expandArray(); // Расширяем массив, если места недостаточно
        }
        // Добавляем элемент в массив и сдвигаем курсор
        array[cursor] = value;
        cursor++;
    }

    // Добавление нескольких элементов сразу magicArray.add(500, 600, 800, 1100);
    void add(int... numbers) {
        for (int number : numbers) {
            add(number);  // Добавляем каждый элемент по очереди
        }
    }

    // Резиновое (динамическое) расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        // Создаем новый массив больше в *2 раза от старого
        int[] newArray = new int[array.length * 2];

        // Переписываем все элементы из старого массива в новый
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray; // Сохраняем новое значение в array
        System.out.println("Расширение массива завершено, сейчас массив = " + array.length); // Выводим расширение массива завершено
    }

    // Возвращает строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";  // Если массив пустой, возвращаем []

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]).append(i < cursor - 1 ? ", " : "]");  // Добавляем разделители
        }

        return result.toString();  // Возвращаем строки массива
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];  // Возвращаем значение если индекс правильный
        }
        return Integer.MIN_VALUE;  // Если индекс неправильный, возвращаем минимальное значение int
    }

    // Удаление элемента по индексу
    int remove(int index) {
        if (index >= 0 && index < cursor) { // Проверяем индекс
            int removedValue = array[index]; // Сохраняем значение которое удалили
            // Сдвинем все элементы после удаления влево
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;  // Уменьшаем количество элементов
            return removedValue;  // Возвращаем удаленное значение
        }
        return Integer.MIN_VALUE;  // Если индекс некорректен, возвращаем минимальное значение int
    }

    // Поиск элемента по значению
    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Удаляем элемент по значению
    boolean removeByValue(int value) {
        int index = indexOf(value); // Находим индекс
        if (index != -1) {
            remove(index); // Если находим элемент удаляем его
            return true;
        }
        return false; // Если не нашли, то false вернули
    }
}

