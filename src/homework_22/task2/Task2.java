package homework_22.task2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Task2 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[]{
                new Bicycle(),
                new Car(),
                new Motorcycle()
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }

    }

}
