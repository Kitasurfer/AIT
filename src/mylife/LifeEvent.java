package mylife;

import java.io.Serializable;
import java.time.LocalDate;

public class LifeEvent implements Serializable {
    private String name;
    private LocalDate date;
    private String iconPath;

    public LifeEvent(String name, LocalDate date, String iconPath) {
        this.name = name;
        this.date = date;
        this.iconPath = iconPath;
    }

    // Геттеры и сеттеры

    public String getName() { return name; }
    public LocalDate getDate() { return date; }
    public String getIconPath() { return iconPath; }
}
