package homework_20.animal;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 09-10-2024
*/

/*

 */
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
