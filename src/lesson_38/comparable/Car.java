package lesson_38.comparable;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 04-11-2024
 */
public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int speed;

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public Car(String toyota, int year) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    // Сравнение машин по году выпуска
    @Override
    public int compareTo(Car other) {
        return this.model.compareTo(other.model);
    }

    public int getWeight() {
    return speed;
    }
}
