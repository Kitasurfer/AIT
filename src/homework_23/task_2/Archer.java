package homework_23.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*

 */
public class Archer extends GameCharacter {


    public Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(getName() + " атакует луком!");
    }
}
