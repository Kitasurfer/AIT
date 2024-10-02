package lesson_16;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 02-10-2024
*/

/*

 */
public class TestMagicArray {
    public static void main(String[] args) {
        // Создаем экземпляр класса MagicArray
        MagicArray magicArray = new MagicArray();

        // Тест добавления крайних значений
        System.out.println("Добавляем крайние значения...");
        magicArray.add(Integer.MIN_VALUE); // добавляем минимальное значение int
        magicArray.add(Integer.MAX_VALUE); // добавляем максимальное значение int

        System.out.println("Текущий массив: " + magicArray.toString());

        // Тест метода indexOf с крайними значениями
        System.out.println("Индекс минимального значения: " + magicArray.indexOf(Integer.MIN_VALUE));
        System.out.println("Индекс максимального значения: " + magicArray.indexOf(Integer.MAX_VALUE));

        // Тест метода get на корректных индексах и на некорректном индексе
        System.out.println("Значение по индексу 0 (MIN_VALUE): " + magicArray.get(0));
        System.out.println("Значение по индексу 1 (MAX_VALUE): " + magicArray.get(1));
        System.out.println("Значение по некорректному индексу 10: " + magicArray.get(10));

        // Тест удаления по индексу и проверка состояния массива
        System.out.println("Удаляем элемент по индексу 0...");
        int removedValue = magicArray.remove(0);
        System.out.println("Удаленное значение: " + removedValue);
        System.out.println("Массив после удаления: " + magicArray.toString());

        // Тест удаления по значению (удаляем MAX_VALUE)
        System.out.println("Удаляем максимальное значение...");
        boolean isRemoved = magicArray.removeByValue(Integer.MAX_VALUE);
        System.out.println("Удаление удалось: " + isRemoved);
        System.out.println("Массив после удаления: " + magicArray.toString());

        // Тест добавления нескольких элементов, включая экстремальные значения
        System.out.println("Добавляем несколько значений (включая MIN_VALUE и MAX_VALUE)...");
        magicArray.add(100, 200, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Массив после добавления нескольких элементов: " + magicArray.toString());

        // Тест на динамическое расширение массива при большом количестве добавлений
        System.out.println("Добавляем элементы для проверки расширения массива...");
        for (int i = 0; i < 100; i++) {
            magicArray.add(i);
        }
        // Разделим на четные и нечетные
        StringBuilder evenNum = new StringBuilder("Четные: ");
        StringBuilder addNum = new StringBuilder("Нечетные: ");

        for (int i = 0; i < magicArray.size(); i++) {
            int value = magicArray.get(i); // Сохраняем и принимаем индекс элемента в массиве
            if (value % 2 == 0) {
                evenNum.append(value).append(" "); // Добавляем новое значение четных в конец строки в StringBuilder
            } else {
                addNum.append(value).append(" "); // Добавляем новое значение нечетных в конец строки в StringBuilder
            }
        }
        System.out.println("Массив после добавления 100 элементов: " + evenNum.toString());
        System.out.println("Массив после добавления 100 элементов: " + addNum.toString());
        System.out.println("Текущий размер массива: " + magicArray.size());

    }
}
