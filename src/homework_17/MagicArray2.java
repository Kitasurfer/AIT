package homework_17; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 06-10-2024
*/

/*
Task 1
Инкапсулировать класс нашего магического массива

Task 2 * (Опционально)
Написать метод lastIndexOf(int value) возвращающий индекс последнего вхождения значения в массиве.
 */

public class MagicArray2 {


    private int[] array; // Массив инкапсулирован (приватный защищен от прямого доступа).
    // доступ к массиву только через публ методы add(), remove(), indexOf()
    private int cursor; // Присваиваем значение по умолчанию = 0;

    // Конструктор по умолчанию
    public MagicArray2() {
        //  Инициализируем массив на 10 элементов по умолчанию.
        array = new int[10]; // Инициализируем массив с 10 элементами.
    }

    //  Конструктор, принимающий массив.
    // Если передан пустой массив или null, инициализируем его с 10 элементами.
    // Если передан непустой массив, создаем массив в два раза больше и добавляем элементы.
    public MagicArray2(int[] array) {
        if (array == null || array.length == 0) {
            this.array = new int[10]; //  Если массив пустой, создаем массив из 10 элементов.
        } else {
            this.array = new int[array.length * 2]; //  Создаем массив в 2 раза больше.
            add(array); // Добавляем элементы из переданного массива.
        }
    }

    //  Метод для добавления одного элемента в массив.
    public void add(int value) {
        // Проверяем, есть ли свободное место в массиве.
        if (cursor == array.length - 1) {
            //  Расширяем массив перед добавлением нового элемента.
            expandArray();
        }
        array[cursor] = value; // Добавляем элемент в массив по индексу курсора.
        cursor++; // Увеличиваем значение курсора, так как добавлен новый элемент.
    }

    // Метод для добавления нескольких элементов в массив.
    public void add(int... numbers) {
        // Добавляем каждый элемент из переданного массива в основной массив.
        for (int number : numbers) {
            add(number); // Используем метод add для каждого элемента.
        }
    }

    // Метод для динамического расширения массива.
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        //  Создаем новый массив в два раза больше текущего.
        int[] newArray = new int[array.length * 2];
        // Копируем значения из старого массива в новый.
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переносим элементы.
        }
        // Обновляем ссылку на новый массив.
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращаем строковое представление массива.
    @Override //  Используем аннотацию @Override, чтобы переопределить метод toString().
    public String toString() {
        if (cursor == 0) return "[]"; //  Если массив пуст, возвращаем "[]".
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]).append(i < cursor - 1 ? ", " : "]"); // Формируем строку с элементами массива.
        }
        return result.toString(); // Возвращаем строку, представляющую массив.
    }

    // Возвращаем текущее количество элементов в массиве.
    public int size() {
        return cursor; //  Количество элементов — это текущее значение курсора.
    }

    // Возвращаем значение элемента по индексу.
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index]; //  Если индекс корректен, возвращаем элемент по индексу.
        }
        return Integer.MIN_VALUE; //  Если индекс некорректен, возвращаем минимальное значение.
    }

    // Удаление элемента по индексу.
    public int remove(int index) {
        /*
        1.  Проверка индекса на валидность.
        2.  Удаление значения по индексу.
        3.  Передвижение элементов влево и уменьшение курсора.
        4. Возвращение удаленного значения.
        */
        if (index >= 0 && index < cursor) {
            //  Сохраняем значение, которое будет удалено.
            int value = array[index];
            //  Перемещаем элементы влево, начиная с удаляемого элемента.
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--; //  Уменьшаем курсор, так как удалили элемент.
            return value; // Возвращаем удаленное значение.
        } else {
            // Если индекс некорректный, возвращаем минимальное значение.
            return Integer.MIN_VALUE;
        }
    }

    //  Поиск индекса первого вхождения значения в массиве.
    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i; //  Возвращаем индекс первого найденного значения.
            }
        }
        return -1; //  Если значение не найдено, возвращаем -1.
    }

    // Task 2, Метод для поиска индекса последнего вхождения значения в массиве.
    public int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) { // Идем с конца массива к началу.
            if (array[i] == value) {
                return i; //  Возвращаем индекс последнего найденного значения.
            }
        }
        return -1; //  Если не найдено, возвращаем -1.
    }

    //  Удаление элемента по значению.
    public boolean removeByValue(int value) {
        /*
        1.  Поиск индекса элемента с заданным значением.
        2.  Если элемент не найден, возвращаем false.
        3.  Если элемент найден, удаляем его и возвращаем true.
        */
        int index = indexOf(value); // Ищем индекс элемента.
        if (index == -1) return false; // Если элемент не найден, возвращаем false.
        remove(index); // Удаляем элемент по найденному индексу.
        return true; // Возвращаем true если элемент успешно удален.
    }

}
/*
Task 1: Инкапсуляция магического массива

Создан класс MagicArray2:
Поля array и cursor инкапсулированы с модификатором private.
Реализован метод add() для добавления одного или нескольких элементов.
Реализован метод remove() для удаления элемента по индексу.
Реализованы методы indexOf() и lastIndexOf() для поиска первого и последнего вхождения элемента.
Реализован метод removeByValue() для удаления элемента по значению.
Добавлены геттеры для получения информации об элементах массива.
Метод expandArray() для динамического расширения массива.
 */