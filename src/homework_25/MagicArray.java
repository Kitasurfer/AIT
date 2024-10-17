package homework_25;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 17-10-2024
*/

/*
Task 1
Параметризовать наш класс "Magic Array", добавив в него обобщение типа (generic).

Реализовать в классе параметризованный интерфейс MyList (код интерфейса прикреплен к уроку)
 */


public class MagicArray<T> {
    T[] array;  // Внутренний массив для хранения значений
    int cursor;  // Текущая позиция для добавления элемента, по умолчанию = 0

    // Конструктор для инициализации массива с размером 10
    @SuppressWarnings("unchecked")
    public MagicArray() {
        array = (T[]) new Object[10];  // Создаем массив типа Object и приводим его к типу T
    }

    // Добавление одного элемента в массив
    void add(T value) {
        if (cursor == array.length) { // Проверяем, есть ли свободное место в массиве
            expandArray(); // Расширяем массив, если места недостаточно
        }
        array[cursor] = value;
        cursor++;
    }

    // Добавление нескольких элементов сразу
    @SafeVarargs
    final void add(T... values) {
        for (T value : values) {
            add(value);  // Добавляем каждый элемент по очереди
        }
    }

    // Резиновое (динамическое) расширение массива
    @SuppressWarnings("unchecked")
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        T[] newArray = (T[]) new Object[array.length * 2];  // Новый массив большего размера

        // Переписываем все элементы из старого массива в новый
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray; // Сохраняем новое значение в array
        System.out.println("Расширение массива завершено, сейчас массив = " + array.length);
    }

    // Возвращает строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";  // Если массив пустой, возвращаем []

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]).append(i < cursor - 1 ? ", " : "]");
        }

        return result.toString();  // Возвращаем строки массива
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];  // Возвращаем значение если индекс правильный
        }
        return null;  // Если индекс неправильный, возвращаем null
    }

    // Удаление элемента по индексу
    T remove(int index) {
        if (index >= 0 && index < cursor) { // Проверяем индекс
            T removedValue = array[index]; // Сохраняем значение которое удалили
            // Сдвинем все элементы после удаления влево
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;  // Уменьшаем количество элементов
            return removedValue;  // Возвращаем удаленное значение
        }
        return null;  // Если индекс некорректен, возвращаем null
    }

    // Поиск элемента по значению
    int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Удаляем элемент по значению
    boolean removeByValue(T value) {
        int index = indexOf(value); // Находим индекс
        if (index != -1) {
            remove(index); // Если находим элемент удаляем его
            return true;
        }
        return false; // Если не нашли, то false вернули
    }
}
