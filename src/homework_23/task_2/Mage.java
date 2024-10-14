package homework_23.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

import static java.lang.Character.getName;

/*

 */
public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }


    @Override
    void attack() {
        System.out.println(getName() + " атакует с заклинанием!");
    }

}
