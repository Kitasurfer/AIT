package homework_20.animal;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 09-10-2024
*/

/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет один родительский
клас и два наследника, расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
 */
public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Katze katze = new Katze("Whiskas", 2, true);

        System.out.println(dog);
        System.out.println(katze);
    }
}
