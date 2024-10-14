package lesson_23.abstracts_class;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

abstract class Animal {

    // Абстрактный класс может иметь поля и константы
    protected String name;

    // Абстрактный класс может иметь конструкторы
    public Animal(String name) {
        this.name = name;
    }

    // Абстрактным метод не имеет реализации (тела метода)
    abstract void eat();
    abstract void move();

    // В абстрактном классе могут присутствовать "обычные" методы с реализацией
    public void sayHello() {
        System.out.println("Hello from animal");
    }
}