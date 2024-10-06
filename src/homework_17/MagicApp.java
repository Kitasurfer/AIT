package homework_17;

public class MagicApp {
    public static void main(String[] args) {

        // Создаем массив
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7};

        MagicArray2 magicArray = new MagicArray2(testArray); // Передаем массив в конструктор

        // Выводим содержимое массива
        System.out.println("Массив после создания: " + magicArray.toString());

        // Добавляем новые элементы в массив
        magicArray.add(8, 9, 10, 15);
        System.out.println("Массив после добавления элементов: " + magicArray.toString());

        // Получаем элемент по индексу 3 с помощью метода get
        int elementIndex = magicArray.get(3);
        System.out.println("Элемент с индексом 3: " + elementIndex);

        // Удаляем элемент с индексом 3
        magicArray.remove(3); // удаляем элемент с индексом 3 (в данном случае это 3)
        System.out.println("Массив после удаления элемента с индексом 3: " + magicArray.toString());

        // Метод lastIndexOf(7) для поиска последнего индекса элемента 7
        int lastIndex = magicArray.lastIndexOf(3);
        System.out.println("Последний индекс элемента 3: " + lastIndex);

        // Удаляем элементы по значению семь и выводим удален или не найден
        boolean isDeleted = magicArray.removeByValue(3);
        int lastIndex2 = magicArray.lastIndexOf(3);
        // Если isDeleted = magicArray.removeByValue(3); проверяет удален ли элемент если удален выводит удален
        //если не нашел то выводит не найден с помощью ? и : это как if и else выбираем одно из двух значений.
        System.out.println("Элемент 3: " + (isDeleted ? "удален" : "не найден (индекс: " + lastIndex2 + ")"));
        System.out.println("Массив после удаления элемента 3: " + magicArray.toString());

        // Удаляем элемент, которого нет в массиве 10_000_000
        isDeleted = magicArray.removeByValue(10_000_000);
        int lastIndex3 = magicArray.lastIndexOf(10_000_000); // Получаем последний индекс элемента 10_000_000
        System.out.println("Элемент 10_000_000: " + (isDeleted ? "удален" : "не найден (индекс: " + lastIndex3 + ")"));
        System.out.println("Массив после попытки удалить элемент 10_000_000: " + magicArray.toString());

    }

}


/*
Task 2 (Опционально): Метод lastIndexOf()

Метод lastIndexOf() реализован для поиска индекса последнего вхождения значения в массиве.
 */
