package mylife;

import java.io.Serializable;
import java.time.LocalDate;

public class LifeLine implements Serializable {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate; // Может быть null
    private String color;

    public LifeLine(String name, LocalDate startDate, LocalDate endDate, String color) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.color = color;
    }

    // Геттеры и сеттеры

    public String getName() { return name; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
    public String getColor() { return color; }
}
