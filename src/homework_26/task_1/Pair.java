package homework_26.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 17-10-2024
*/

/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
Пример использования:
Pair<String> pair = new Pair<>("Hello", "World");
System.out.println(pair.getFirst()); // Вывод: Hello
System.out.println(pair.getSecond()); // Вывод: World

pair.swap();
System.out.println(pair.getFirst()); // Вывод: World
System.out.println(pair.getSecond()); // Вывод: Hello
 */
public class Pair <T> {
    // Два приватных поля для хранения значений одного типа
    private T first;
    private T second;

    // Конструктор принимает два значения типа T и инициализирует их
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Метод для обмена значений first и second
    public void swap() {
        // Создаем временную переменную для хранения значения first
        T temp = first;
        // Меняем местами first и second
        first = second;
        second = temp;
    }

    // Метод для получения первого элемента
    public T getFirst() {
        return first;
    }

    // Метод для установки значения первого элемента
    public void setFirst(T first) {
        this.first = first;
    }

    // Метод для получения второго элемента
    public T getSecond() {
        return second;
    }

    // Метод для установки значения второго элемента
    public void setSecond(T second) {
        this.second = second;
    }

}