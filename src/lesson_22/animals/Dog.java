package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
    Класс Dog — это подкласс Animal.
    Он наследует методы из Animal, но не переопределяет voice().
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    // Поскольку здесь нет переопределенных методов, Dog использует метод voice() из класса Animal.

    @Override
    public String toString() {
        return "Dog name: " + this.name;
    }

}
