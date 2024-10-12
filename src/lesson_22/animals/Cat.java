package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
    Класс Cat — это подкласс Animal. Он наследует методы и поля класса Animal.
    Методы, такие как voice() и toString(), будут переопределены для специфического поведения кота.
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // Метод eat — это уникальный метод для класса Cat, его нет в родительском классе
    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределяем метод voice(), чтобы отразить специфичное поведение для кота
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!");
    }

    // Переопределяем метод toString() для вывода строки, характерной для объекта Cat
    @Override
    public String toString() {
        return "Cat name: " + this.name;
    }

    // Перегруженный метод voice с параметром
    public void voice(String str) {
        System.out.println("Cat say " + str);
    }
}
