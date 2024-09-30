package homework_15;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 30-09-2024
*/

/*

 */
    public class Car {
        String brand;
        String madel;
        int year;

        // Konstruktor Car
    public Car(String brand, String madel, int year) {
        this.brand = brand;
        this.madel = madel;
        this.year = year;
    }
    // Dvij
    public void drive() {
        System.out.println("Ich geen in " + brand + madel + "!");
    }
    //Stop
    public void stop() {
        System.out.println("Ich stop! ");
    }
    //Test
    public static void main(String[] args) {
        //Creat Klass Car
        Car car = new Car("Tesla ", " BMW", 2024);

        //Objekt
        car.drive(); // Ich drive na ""
        car.stop(); //Ich stop
    }
    }

