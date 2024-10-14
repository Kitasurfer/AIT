package homework_23.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*

 */
public class Warrior extends GameCharacter {


    public Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(getName() + " атакует мечом!");
    }
}
