package lesson_38.comparable;

import java.util.Comparator;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 04-11-2024
 */
/*

 */
public class CarSpeedComparator implements Comparator<Car> {



    @Override
    public int compare(Car car1, Car car2) {
        return car2.getSpeed() -car1.getSpeed();
    }
}
