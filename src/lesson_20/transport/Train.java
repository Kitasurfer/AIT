package lesson_20.transport; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 09-10-2024
*/

import lesson_20.transpor.Vehicle;

/*

 */
public class Train extends Vehicle {
    private int capacity; // Переменная для хранения общей вместимости поезда
    private int countPassengers; // Переменная для хранения количества пассажиров
    private int countWagons; // Переменная для хранения количества вагонов
    private final int wagonCapacity; // Константа для хранения вместимости одного вагона

    // Конструктор класса Train, который принимает модель, год, вместимость одного вагона и количество вагонов
    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year); // Вызов конструктора суперкласса Vehicle для инициализации модели и года
        this.wagonCapacity = wagonCapacity; // Инициализация вместимости одного вагона
        this.countWagons = countWagons; // Инициализация количества вагонов
        this.capacity = countWagons * wagonCapacity; // Вычисление общей вместимости поезда
        calculateCapacity(); // Вызов метода для пересчета общей вместимости
    }

    // Приватный метод для вычисления общей вместимости поезда
    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity; // Общая вместимость равна количеству вагонов, умноженному на вместимость одного вагона
    }

    // Метод для установки количества вагонов с пересчетом вместимости
    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons; // Изменение количества вагонов
        calculateCapacity(); // Пересчет общей вместимости после изменения количества вагонов
    }

    // Метод для получения общей вместимости поезда
    public int getCapacity() {
        return capacity; // Возвращает значение общей вместимости
    }

    // Метод для получения количества пассажиров
    public int getCountPassengers() {
        return countPassengers; // Возвращает количество пассажиров
    }

    // Метод для получения количества вагонов
    public int getCountWagons() {
        return countWagons; // Возвращает количество вагонов
    }

    // Метод для получения вместимости одного вагона
    public int getWagonCapacity() {
        return wagonCapacity; // Возвращает вместимость одного вагона
    }
}
