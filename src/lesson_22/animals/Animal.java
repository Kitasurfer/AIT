package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
    Класс Animal — это родительский класс, который содержит методы, которые будут наследоваться и/или переопределяться
    в дочерних классах (Cat, Dog, Hamster).
    Мы будем переопределять методы, такие как voice(), и использовать метод toString() для вывода строкового
    представления объекта.
 */
public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    // Метод, который будет переопределен в дочерних классах
    public void voice() {
        System.out.println("Animal say something");
    }


    // Метод toString, который возвращает строковое представление объекта
    public String toString() {
        return "Animal name: " + this.name;
    }
}

