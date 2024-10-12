package homework_22.task2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Task 2
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и
Motorcycle (дочерние классы).
Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.
Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего
типа двигателя (если есть).
Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine()
для каждого транспортного средства.
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
