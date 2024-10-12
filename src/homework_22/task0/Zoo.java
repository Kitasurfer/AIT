package homework_22.task0;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 12-10-2024
*/

import lesson_22.animals.Animal;
import lesson_22.animals.Cat;
import lesson_22.animals.Dog;
import lesson_22.animals.Hamster;

/*
Task 0
Воспроизвести код, написанный на уроке.
 */
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 12-10-2024
*/

import lesson_22.animals.Animal;
import lesson_22.animals.Cat;
import lesson_22.animals.Dog;
import lesson_22.animals.Hamster;

/*
Task 0
Воспроизвести код, написанный на уроке.
 */
public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Cat("Barsik"),
                new Dog("Jack"),
                new Hamster("Homyak")
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.voice();
        }


    }

}