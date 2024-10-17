package lists; // Указание пакета, в котором находится класс, помогает организовать код

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 17-10-2024
*/
// Комментарий с информацией о группе, авторе и дате создания класса. Это полезно для отслеживания версий и ведения документации

public class MyArrayList<T> {
    // Объявление обобщенного класса `MyArrayList`, где `T` является параметром типа. Это позволяет использовать любой тип данных в классе

    private T[] array;
    // Приватное поле `array` типа `T[]` (массив объектов типа `T`). Оно хранит элементы списка

    private int cursor;
    // Переменная `cursor` отслеживает текущее количество элементов в массиве. По умолчанию имеет значение 0

    @SuppressWarnings("unchecked")
    // Подавляем предупреждение компилятора о непроверяемом приведении типа
    public MyArrayList() {
        array = (T[]) new Object[10];
                // Инициализация массива размером 10 элементов. Это стандартный начальный размер массива
    }

    @SuppressWarnings("unchecked")
    // Подавляем предупреждение компилятора при приведении типа
    public MyArrayList(T[] array) {
        // Конструктор, принимающий массив. Если массив пустой или null, создается новый массив с размером 10
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            // Создаем массив в 2 раза большего размера, чем исходный, для возможности добавления новых элементов
            add(array);
            // Добавляем все элементы из переданного массива в новый
        }
    }

    // Метод для добавления одного элемента в массив
    public void add(T value) {

        // Проверка на наличие свободного места в массиве
        if (cursor == array.length - 1) {
            expandArray();
            // Если нет места, массив расширяется
        }

        array[cursor] = value;
        // Добавляем значение в массив
        cursor++;
        // Увеличиваем значение курсора
    }

    // Метод для добавления нескольких элементов в массив (вариативные параметры)
    public void add(T... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
            // Добавляем каждый элемент массива `numbers` в список
        }
    }

    // Приватный метод для динамического расширения массива
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        // Создаем новый массив в 2 раза большего размера
        T[] newArray = (T[]) new Object[array.length * 2];

        // Копируем все элементы из старого массива в новый
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        // Меняем ссылку на новый массив
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    public String toString() {

        if (cursor == 0) return "[]";
        // Если в массиве нет элементов, возвращаем пустой массив

        String result = "[";
        // Начало строки
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");
            // Добавляем элементы массива в строку с разделителями
        }

        return result;
        // Возвращаем строку
    }

    // Возвращает количество элементов в массиве
    public int size() {
        return cursor;
        // Возвращает текущее значение курсора, которое отслеживает количество элементов
    }

    // Возвращает элемент по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
            // Возвращаем элемент, если индекс корректен
        }
        return null;
        // Если индекс некорректен, возвращаем null
    }

    // Удаление элемента по индексу
    public T remove(int index) {

        if (index >= 0 && index < cursor) {
            T value = array[index];
            // Сохраняем удаляемое значение для возврата

            // Сдвигаем элементы массива влево, начиная с удаляемого индекса
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            // Уменьшаем значение курсора
            return value;
            // Возвращаем удаленное значение
        } else {
            return null;
            // Если индекс некорректен, возвращаем null
        }
    }

    // Поиск первого вхождения элемента
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
                // Возвращаем индекс первого найденного элемента
            }
        }
        return -1;
        // Если элемент не найден, возвращаем -1
    }

    // Поиск последнего вхождения элемента
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
                // Возвращаем индекс последнего найденного элемента
            }
        }
        return -1;
        // Если элемент не найден, возвращаем -1
    }

    // Удаление элемента по значению
    public boolean removeByValue(T value) {
        int index = indexOf(value);
        // Поиск индекса первого вхождения элемента
        if (index == -1) return false;
        // Если элемент не найден, возвращаем false

        remove(index);
        // Удаляем элемент по индексу
        return true;
        // Возвращаем true, если удаление прошло успешно
    }
}