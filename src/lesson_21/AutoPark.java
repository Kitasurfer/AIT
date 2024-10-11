package lesson_21;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 10-10-2024
*/

public class AutoPark {
    public static void main(String[] args) {

        // Создаем объект водителя автобуса с именем "John" и номером лицензии "LN-19945395"
        BusDriver busDriver = new BusDriver("John", "LN-19945395");

        // Создаем автобус с водителем busDriver и количеством пассажиров 15
        Autobus bus = new Autobus(busDriver,15);

        // Создаем второго водителя автобуса с именем "Margo" и номером лицензии "AE-54565655"
        BusDriver busDriver1 = new BusDriver("Margo", "AE-54565655");
        Autobus bus1 = new Autobus(busDriver1, 24);

        // Выводим информацию о первом и втором автобусах
        System.out.println("bus: " + bus.toString());
        System.out.println("bus1: " + bus1.toString());

        // Меняем водителя второго автобуса на "Peter" с номером лицензии "PE-45878889"
        BusDriver peter = new BusDriver("Peter", "PE-45878889");
        bus1.setDriver(peter);
        System.out.println("bus1: " + bus1.toString());

        // Устанавливаем bus1 в null, освобождая ссылку на объект
        bus1 = null;

        // Выводим информацию о водителе "Peter"
        System.out.println(peter.toString());

        // Устанавливаем новый автопилот для первого автобуса
        bus.installNewAutopilot("AP-gpt6");
        System.out.println(bus.toString());

        // Меняем имя водителя первого автобуса на "Sebastian"
        busDriver.setName("Sebastian");
        System.out.println(bus.toString());

        System.out.println("\n============================");
        System.out.println("количество пассажиров в автобусе: " + bus.getCountPassenger());
        bus.showListOfPassengers();

        // Добавляем пассажиров в автобус
        Passenger passenger = new Passenger("John");
        Passenger margo = new Passenger("Margo");

        bus.takePassenger(passenger);
        bus.showListOfPassengers();
        System.out.println("===============");
        bus.takePassenger(margo);
        bus.showListOfPassengers();
        System.out.println("===============");
        bus.takePassenger(margo);
        bus.showListOfPassengers();
    }
}
