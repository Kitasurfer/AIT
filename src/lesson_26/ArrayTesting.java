package lesson_26; // Указание пакета, в котором находится класс, помогает организовать код

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 17-10-2024
*/
// Комментарий с информацией о группе, авторе и дате создания файла. Это полезно для отслеживания версий и документации

import lists.MyArrayList;
// Импорт класса `MyArrayList` из пакета `lists`. Этот класс, вероятно, является пользовательской реализацией списка на основе массива

public class ArrayTesting {
    // Объявление публичного класса `ArrayTesting`, который содержит точку входа программы для тестирования методов `MyArrayList`

    public static void main(String[] args) {
        // Метод `main` является точкой входа для выполнения программы

        MyArrayList<Integer> numbers = new MyArrayList<>();
        // Создание объекта `MyArrayList` для хранения элементов типа `Integer`

        numbers.addAll(1, 2, 3, 4, 5, 6);
        // Добавление нескольких элементов в список `numbers`

        System.out.println(numbers);
        // Вывод содержимого списка `numbers` в консоль

        System.out.println(numbers.indexOf(4));
        // Поиск индекса элемента со значением 4 в списке и вывод этого индекса

        System.out.println(numbers.remove(5));
        // Удаление элемента со значением 5 из списка и вывод результата операции (успешно или нет)
        System.out.println(numbers);
        // Вывод измененного списка после удаления

        MyArrayList<String> strings = new MyArrayList<>();
        // Создание объекта `MyArrayList` для хранения строковых значений

        strings.add("Java");
        // Добавление строки "Java" в список `strings`
        strings.addAll("Python", "JS", "Scala", "Kotlin");
        // Добавление нескольких строк в список `strings`

        System.out.println(strings);
        // Вывод содержимого списка `strings` в консоль

        System.out.println(strings.remove("Basic"));
        // Попытка удалить элемент со значением "Basic" из списка (скорее всего, это значение отсутствует в списке)
        System.out.println(strings.remove("Scala"));
        // Удаление элемента со значением "Scala" и вывод результата операции
        System.out.println(strings);
        // Вывод измененного списка после удаления

        System.out.println(numbers.lastIndexOf(6));
        // Поиск последнего индекса элемента со значением 6 в списке и вывод этого индекса

        System.out.println();
        // Пустая строка для форматирования вывода
    }
}
