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
    // Массив для хранения элементов типа T
    T[] array;
    // Курсор указывает на следующий свободный индекс
    int cursor; // присвоено значение по умолчанию = 0;

    // Конструктор создает массив начального размера 10
    public MagicArray() {
        this.array = (T[]) new Object[10];
    }

    // Добавление одного элемента в массив
    void add (T value) {

        // Проверка. Есть ли свободное место во внутреннем массиве
        // Если места нет, расширяем массив
        if (cursor == array.length - 1) {
            expandArray(); // Расширить массив перед добавлением нового элемента
        }

        // Добавляем новый элемент в массив
        array[cursor] = value;
        // Увеличиваем курсор
        cursor++;

    }

    // Добавление нескольких элементов в массив
    void add(T... numbers) {
        // numbers обрабатывается как массив переменной длины
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]); // Добавляем каждый элемент в массив
        }

    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. Создаем новый массив большего размера (в 2 раза больше)
        2. Переписываем в новый массив все значения из старого до курсора
        3. Переносим ссылку на новый массив
         */

        // 1. Создаем новый массив в 2 раза больше
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2. Переносим все значения из старого массива в новый
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Копируем значения
        }

        // 3. Перебрасываем ссылку на новый массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива, например: [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]"; // Если массив пуст, возвращаем пустой массив

        String result = "[";
        // Собираем строковое представление всех элементов массива
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result; // Возвращаем строку
    }

    // Возвращает текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    T get(int index) {
        // Проверка корректности индекса
        if (index >= 0 && index < cursor) {
            return array[index]; // Если индекс корректен, возвращаем элемент
        } else {
            System.out.println("индекс \"не корректный\"");
            return null; // Возвращаем null, если индекс некорректный
        }
        // TODO: Улучшить обработку некорректного индекса
    }

    // Удаление элемента по индексу
    T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удаляем значение по индексу
        3. Передвигаем курсор, так как количество элементов уменьшилось
        4. Возвращаем старое значение
        */
        // TODO: реализовать корректную проверку индекса
        if (this.cursor < 0 || this.cursor > array.length - 1) {
            return null;
        } else {
            T oldValue = array[index]; // Сохраняем удаляемое значение
            // Сдвигаем оставшиеся элементы влево, начиная с удаленного индекса
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--; // Уменьшаем курсор
            return oldValue; // Возвращаем старое значение
        }

    }

    public static void main(String[] args) {
        // Пример использования MagicArray с типом Integer
        MagicArray<Integer> list = new MagicArray<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // Выводим все элементы массива
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        System.out.println(list.size()); // Выводим текущий размер массива
        list.remove(1); // Удаляем элемент по индексу 1

        // Выводим оставшиеся элементы после удаления
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println(list.size()); // Выводим новый размер массива
    }
}
