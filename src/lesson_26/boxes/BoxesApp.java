package lesson_26.boxes; // Указание пакета, к которому принадлежит класс, позволяет организовать код в структурированную иерархию

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 17-10-2024
*/
// Комментарий с информацией о группе, авторе и дате создания файла, полезен для отслеживания версий и истории разработки

public class BoxesApp {
    // Объявление публичного класса с именем `BoxesApp`, который является точкой входа для программы

    public static void main(String[] args) {
        // Метод `main` является точкой входа для запуска программы

        String variable = "Hello";
        // Переменная типа String, инициализируется значением "Hello"

        System.out.printf("Шаблон строки %s\n", variable);
        // Вывод строки в консоль с использованием форматирования. %s заменяется значением переменной `variable`

        SuperBoxGen<String> box = new SuperBoxGen<>("Hello");
        // Создание объекта `SuperBoxGen` с типом String. Конструктор принимает строку "Hello"

        SuperBoxGen<Double> doubleBox = new SuperBoxGen<>(3.14);
        // Создание объекта `SuperBoxGen` с типом Double. Передается значение 3.14

        // Если мы не укажем тип при создании объекта, будет подставлен Object
        SuperBoxGen boxObject = new SuperBoxGen<>("String");
        // Объект создается без указания конкретного типа, поэтому по умолчанию используется Object

        boxObject.setValue(1);
        // Установка значения 1 для объекта `boxObject`. Это приведет к тому, что значение станет Integer, несмотря на исходную строку

        // Object
        // System.out.println(boxObject.getValue() + 5.0);
        // Эта строка закомментирована, так как при использовании Object тип данных не определен, что может привести к ошибке во время сложения

        System.out.println((doubleBox.getValue() + 5.0));
        // Вывод суммы значения `doubleBox` и 5.0. Результат: 8.14, так как тип `doubleBox` — Double

        SuperBoxGen<Integer> integerSuperBoxGen = new SuperBoxGen<>(100);
        // Создание объекта `SuperBoxGen` с типом Integer и значением 100

        System.out.println(integerSuperBoxGen.getValue() + 25);
        // Вывод суммы значения `integerSuperBoxGen` и 25. Результат: 125

        // int примитив -> class Integer ссылочный тип данных
        // Комментарий указывает на различие между примитивными типами (int) и ссылочными типами (Integer), которые используются в обобщенных классах
    }
}
