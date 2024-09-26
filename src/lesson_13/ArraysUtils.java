package lesson_13;  // Определение пакета, в котором находится данный класс

// Основной класс, содержащий утилиты для работы с массивами
public class ArraysUtils {

    // Метод линейного поиска элемента в массиве
    // Осуществляется перебор всех элементов массива и сравнение с искомым значением
    // Если значение найдено, возвращается индекс элемента массива
    // Если значение не найдено, возвращается -1
    public static int linearSearch(int[] array, int searchValue) {
        int counter = 0;  // Счетчик шагов

        // Проходим по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            counter++;  // Увеличиваем счетчик шагов
            // Проверяем, совпадает ли текущий элемент с искомым значением
            if (array[i] == searchValue) {
                System.out.println("Линейный поиск нашел за: " + counter + " шагов");
                return i;  // Возвращаем индекс найденного элемента
            }
        }
        System.out.println("Линейный поиск НЕ нашел. Потрачено шагов: " + counter);
        return -1;  // Если элемент не найден, возвращаем -1
    }

    // Метод ищет минимальное значение в массиве и возвращает его индекс
    public static int minIndex(int[] array) {
        int min = array[0];  // Начинаем с первого элемента как минимального
        int minIndex = 0;    // Индекс минимального элемента (первый по умолчанию)
        // Проходим по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            // Если текущий элемент меньше текущего минимального
            if (array[i] < min) {
                min = array[i];        // Обновляем минимальное значение
                minIndex = i;          // Обновляем индекс минимального значения
            }
        }
        return minIndex;  // Возвращаем индекс минимального элемента
    }

    // Метод ищет минимальное значение в части массива (от startIndex до конца)
    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];  // Начинаем с элемента по индексу startIndex
        int minIndex = startIndex;    // Индекс минимального элемента
        // Проходим по оставшейся части массива
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {  // Если текущий элемент меньше минимального
                min = array[i];    // Обновляем минимальное значение
                minIndex = i;      // Обновляем индекс минимального значения
            }
        }
        return minIndex;  // Возвращаем индекс минимального элемента
    }

    // Сортировка выбором
    // Алгоритм: выбираем минимальный элемент и ставим его в начало,
    // затем повторяем для оставшейся части массива
    public static void sortSelection(int[] array) {
        // Проходим по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            // Находим минимальный элемент в оставшейся части массива
            int localMin = minIndex(array, i);

            // Меняем местами текущий элемент и минимальный элемент
            int temp = array[i];           // Сохраняем текущее значение
            array[i] = array[localMin];    // Меняем местами с минимальным
            array[localMin] = temp;        // Записываем сохраненное значение
        }
    }

    // Копирование массива
    public static int[] copyOfArray(int[] array) {
        int[] newArray = new int[array.length];  // Создаем новый массив такой же длины
        // Копируем элементы из старого массива в новый
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];  // Копируем каждый элемент
        }
        return newArray;  // Возвращаем новый массив
    }

    // Бинарный поиск значения в массиве
    // Предполагается, что массив отсортирован
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;               // Начальный индекс
        int endIndex = array.length - 1;  // Конечный индекс
        int middleIndex;
        int counter = 0;  // Счетчик шагов

        // Пока есть часть массива для поиска
        while (startIndex <= endIndex) {
            counter++;  // Увеличиваем счетчик шагов

            // Вычисляем средний индекс
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // Если значение в середине совпадает с искомым, возвращаем индекс
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }

            // Если значение в середине больше искомого, ищем в левой половине
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            }
            // Если значение в середине меньше искомого, ищем в правой половине
            else {
                startIndex = middleIndex + 1;
            }
        }

        // Если значение не найдено
        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;  // Возвращаем -1, если значение не найдено
    }
}
