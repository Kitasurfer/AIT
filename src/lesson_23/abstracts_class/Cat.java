package lesson_23.abstracts_class;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Кот " + name + " очень любит кушать!!!");
    }

    @Override
    void move() {
        System.out.println("Кот передвигается");
    }
}
