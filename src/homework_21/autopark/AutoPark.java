package homework_21.autopark;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Task 1
Воспроизвести код, написанный на уроке.
 */



import lesson_21.Autobus;     // Импортируем существующие классы
import lesson_21.BusDriver;
import lesson_21.Passenger;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriverMercedes = new BusDriver("John", "LN-87777");
        Autobus mercedesBus = new Autobus(busDriverMercedes, 15);

        BusDriver busDriverMan = new BusDriver("Margo", "AE-876545");
        Autobus manBus = new Autobus(busDriverMan, 24);

        BusDriver busDriverScania = new BusDriver("Peter", "PE-54878");
        Autobus scaniaBus = new Autobus(busDriverScania, 30);

        System.out.println("Автобус Mercedes: " + mercedesBus.toString());
        System.out.println("Автобус MAN: " + manBus.toString());
        System.out.println("Автобус Scania: " + scaniaBus.toString());

        BusDriver newDriverScania = new BusDriver("Kris", "SE-12345678");
        scaniaBus.setDriver(newDriverScania);
        System.out.println("Обновленный автобус Scania: " + scaniaBus.toString());

        scaniaBus = null;

        System.out.println("Инфо о водителе Sebastian: " + newDriverScania.toString());

        mercedesBus.installNewAutopilot("AP-a6I87687");
        System.out.println("Обновленный автобус Mercedes: " + mercedesBus.toString());

        Passenger passengerJohn = new Passenger("John");
        Passenger passengerMargo = new Passenger("Margo");
        Passenger passengerPeter = new Passenger("Peter");

        mercedesBus.takePassenger(passengerJohn);
        manBus.takePassenger(passengerMargo);
        mercedesBus.takePassenger(passengerMargo);

        System.out.println("\nПассажиры в Mercedes:");
        mercedesBus.showListOfPassengers();

        System.out.println("\nПассажиры в MAN:");
        manBus.showListOfPassengers();

        System.out.println("\nПопытаемся добавить того же пассажира в Mercedes:");
        mercedesBus.takePassenger(passengerMargo);
        mercedesBus.showListOfPassengers();

        int freeSeatsMercedes = mercedesBus.getCapacity() - mercedesBus.getCountPassenger();
        int freeSeatsMan = manBus.getCapacity() - manBus.getCountPassenger();
        System.out.println("Свободные места в Mercedes: " + freeSeatsMercedes);
        System.out.println("Свободные места в MAN: " + freeSeatsMan);
    }
}