package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
    Главный класс приложения, который демонстрирует использование методов в различных классах (Cat, Dog, Hamster),
    а также как работает переопределение методов и вызовы уникальных методов каждого класса.
 */
public class ZooApp {
    public static void main(String[] args) {
        // Создаем объект класса Cat и вызываем его методы
        Cat cat = new Cat("cat");
        cat.voice();  // Вызывает переопределенный метод voice() из класса Cat
        cat.eat();  // Вызывает уникальный метод eat(), который есть только у Cat
        System.out.println(cat.toString());  // Вызывает переопределенный метод toString() из класса Cat

        System.out.println("\n===================\n");

        // Создаем объект класса Dog и вызываем его методы
        Dog dog = new Dog("dog");
        dog.voice();  // Использует метод voice() из родительского класса Animal, так как Dog его не переопределяет
        System.out.println(dog.toString());  // Использует метод toString() из родительского класса Animal

        System.out.println("\n===================\n");

        // Создаем объект класса Hamster и вызываем его методы
        Hamster hamster = new Hamster("hamster");
        hamster.voice();  // Вызывает переопределенный метод voice() из класса Hamster
        System.out.println(hamster.toString());  // Использует метод toString() из родительского класса Animal

        System.out.println("\n===================\n");

        Test test = new Test("My Test Title");
        System.out.println(test.toString());

    }
}
