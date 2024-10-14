package lesson_23.abstracts_class;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    void move() {
        System.out.println(name + " передвигается!");
    }

    @Override
    public void sayHello() {
        System.out.println(name + " says hello. Bark!");
    }
}
