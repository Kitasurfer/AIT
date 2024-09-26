package mylife;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserProfile implements Serializable {
    private String name;
    private LocalDate birthDate;
    private String gender;
    private List<CountryPeriod> countryPeriods;
    private List<LifeLine> lifeLines;
    private List<LifeEvent> lifeEvents;
    private List<String> interests;

    public UserProfile(String name, LocalDate birthDate, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.countryPeriods = new ArrayList<>();
        this.lifeLines = new ArrayList<>();
        this.lifeEvents = new ArrayList<>();
        this.interests = new ArrayList<>();
    }

    // Геттеры и сеттеры

    public String getName() { return name; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getGender() { return gender; }
    public List<CountryPeriod> getCountryPeriods() { return countryPeriods; }
    public List<LifeLine> getLifeLines() { return lifeLines; }
    public List<LifeEvent> getLifeEvents() { return lifeEvents; }
    public List<String> getInterests() { return interests; }

    // Методы для управления данными пользователя
}
