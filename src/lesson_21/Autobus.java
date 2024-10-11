package lesson_21;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 10-10-2024
*/

import java.util.Arrays;

public class Autobus {

    /*
    Для создания связи типа HAS-A мы определяем поле класса,
    которое будет хранить ссылку на объект другого класса

    Ассоциация (в том числе и Агрегация, и Композиция) реализуется через создание ссылок
    на другие объекты внутри класса.
    Отношение, где один класс использует другой класс в качестве одного из своих полей

    Агрегация Autobus и BusDriver. Автобус содержит водителя,
    но водитель может существовать независимо от автобуса (пересесть в другой автобус, остаться дома и т.п.)

    Композиция между Autobus и Autopilot. Автопилот является неотъемлемой частью автобуса.
    И не может существовать без автобуса.

    Важные аспекты ассоциации.

    Направленность связи. Однонаправленная или двунаправленная связь.

    Кардинальность связи. Определяет, сколько объектов одного класса может быть ассоциировано с объектом другого класса

    One-to-One (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим)

    1 : 1 -> Автобус и Двигатель
    Каждый автобус может иметь ровно один двигатель и на каждый двигатель приходится ровно один автобус

    1 : Many -> Автобус и Список пассажиров. Один автобус может перевозить множество пассажиров

    Many : Many -> Список Автобусов и список автобусных остановок.
    Каждый автобус останавливается на множестве остановок
    и каждая остановка может обслуживать множество автобусов
    */

    private static int counter = 1;  // Счетчик автобусов

    private final int id;  // Уникальный идентификатор автобуса

    private BusDriver driver; // агрегация ("мягкая" связь)
    private Autopilot autopilot; // композиция (жесткая / неразрывная связь)

    private final int capacity;  // Вместимость автобуса
    private int countPassenger;  // Текущее количество пассажиров

    private final Passenger[] passengers;  // Массив пассажиров

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;  // Присваиваем уникальный ID автобусу
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        // Реализуем двунаправленную связь
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];  // Инициализируем массив пассажиров
    }

    // Метод для отображения списка пассажиров
    public void showListOfPassengers() {
        if (countPassenger == 0) {
            System.out.println("[]");  // Если пассажиров нет, выводим пустой массив
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());  // Добавляем информацию о каждом пассажире
            sb.append((i < countPassenger - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());  // Выводим итоговый список пассажиров
    }

    // Метод для посадки пассажира
    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;  // Если пассажир null, возвращаем false

        /*
        1. Надо проверить свободное место
        2. Находится ли этот пассажир уже в нашем автобусе?
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем количество пассажиров в автобусе
            3.3. Возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
        */

        if (countPassenger < capacity) {
            // Место есть
            // Проверяем, есть ли такой пассажир уже в автобусе
            if (isPassengerInBus(passenger)){
                System.out.printf("Пассажир id %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }

        // Свободного места нет
        System.out.printf("В автобусе id %d свободных мест нет!\n", this.id);
        return false;
    }

    // Метод проверки, находится ли пассажир в автобусе
    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;  // Пассажир найден
            }
        }
        return false;  // Пассажир не найден
    }

    // Метод для обновления версии автопилота
    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    // Метод для установки нового автопилота
    public void installNewAutopilot(String softwareVersion) {
        this.autopilot.setAutobus(null);  // Очищаем старую связь
        this.autopilot = new Autopilot(softwareVersion);  // Устанавливаем новый автопилот
        this.autopilot.setAutobus(this);  // Устанавливаем связь с текущим автобусом
    }

    // Метод для назначения нового водителя
    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    // Геттеры для полей класса
    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    // Метод для вывода информации об автобусе
    public String toString() {
        return "Autobus: {id: " + id + ", capacity: " + capacity +
                "; driver: " + driver.toString() +
                "; autopilot: " + autopilot.toString() +
                "}";
    }
}
