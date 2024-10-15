package homework_24.task_1;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 15-10-2024
*/

/*

 */
public class Triathlete implements Swimmer, Runner{


    @Override
    public void run() {
        System.out.println("Бежим");
    }

    @Override
    public void swim() {
        System.out.println("Плывем");

    }
}
