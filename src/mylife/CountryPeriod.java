package mylife;

import java.io.Serializable;
import java.time.LocalDate;

public class CountryPeriod implements Serializable {
    private String country;
    private LocalDate startDate;
    private LocalDate endDate; // Может быть null

    public CountryPeriod(String country, LocalDate startDate, LocalDate endDate) {
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Геттеры и сеттеры

    public String getCountry() { return country; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
}
