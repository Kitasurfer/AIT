package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
    Класс Hamster — это подкласс Animal.
    Он переопределяет метод voice(), чтобы отразить специфическое поведение хомяка.
 */
public class Hamster extends Animal {
    // Переопределяем метод voice(), чтобы хомяк издавал свой звук
    @Override
    public void voice() {
        System.out.println("Hamster say NOM-NOM!");
    }
}
