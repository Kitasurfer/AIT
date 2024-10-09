package homework_20.animal;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 09-10-2024
*/

/*

 */
public class Katze extends Animal {
    private boolean isIndoor;

    public Katze(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Indoor: " + (isIndoor ? "Yes" : "No");
    }
}
