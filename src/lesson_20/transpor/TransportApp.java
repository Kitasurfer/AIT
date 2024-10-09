package lesson_20.transpor; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 09-10-2024
*/

import lesson_20.transport.Train; // Импорт класса Train из пакета lesson_20.transport

public class TransportApp {
    public static void main(String[] args) {
        // Создаем объект класса Bus с моделью "Bus -X1", годом выпуска 2020 и вместимостью 10 пассажиров
        Bus bus = new Bus("Bus -X1", 2020, 10);

        // Выводим информацию о автобусе с помощью метода toString()
        System.out.println(bus.toString());

        // Запускаем автобус с помощью метода start()
        bus.start();
        // Добавляем пассажиров в автобус
        bus.takePassenger();
        bus.takePassenger();

        // Останавливаем автобус с помощью метода stop()
        bus.stop();

        // Выводим модель автобуса и его вместимость
        System.out.println("Model Bus: " + bus.getModel());
        System.out.println("bus.getCapacity: " + bus.getCapacity());

        // Разделитель для вывода
        System.out.println("\n=============================\n");

        // Создаем объект класса Train с моделью "Skoda", годом выпуска 2024, вместимостью вагона 9 пассажиров и 50 вагонами
        Train train = new Train("Skoda", 2024, 90, 5);

        // Выводим информацию о поезде с помощью метода toString()
        System.out.println(train.toString());
        // Запускаем поезд с помощью метода start()
        train.start();
        // Выводим модель поезда и его вместимость
        System.out.println("Model Train: " + train.getModel());
        System.out.println("Capacity: " + train.getCapacity());

        // Изменяем количество вагонов и выводим обновленную вместимость
        train.setCountWagons(3);
        System.out.println("Updated Capacity: " + train.getCapacity());
        System.out.println("Wagon Capacity: " + train.getWagonCapacity());
        System.out.println("Passengers in Train: " + train.getCountPassengers());

        System.out.println("\n==============\n");

        // Создаем еще один объект Bus
        Bus bus1 = new Bus("Bus-X2", 2024, 3);

        // Добавляем пассажиров в автобус с помощью цикла, чтобы попытаться добавить больше, чем вместимость
        for (int i = 0; i < 4; i++) {
            if (bus1.takePassenger()) {
                System.out.println("Пассажир успешно добавлен.");
            } else {
                System.out.println("Не удалось добавить пассажира, автобус полон.");
            }
        }

        System.out.println("B2- " + bus1.dropPassenger());
        System.out.println("B1+" + bus.takePassenger());

        // Пытаемся высадить пассажиров
        System.out.println("\nПытаемся высадить пассажиров:");
        for (int i = 0; i < 4; i++) {
            if (bus1.dropPassenger()) {
                System.out.println("Пассажир успешно высажен.");
            } else {
                System.out.println("Нет пассажиров для высадки.");
            }
        }
    }
}
