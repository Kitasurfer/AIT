package mylife;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LifeStatistics {
    private UserProfile userProfile;

    // Параметры статистики
    private long yearsLived;
    private long monthsLived;
    private long weeksLived;
    private long daysLived;
    private double percentLived;
    private long daysLeft;
    private double lifeExpectancy;

    // Средняя продолжительность жизни
    private static final Map<String, Double> lifeExpectancyData = new HashMap<>();

    static {
        lifeExpectancyData.put("Германия_М", 78.6);
        lifeExpectancyData.put("Германия_Ж", 83.4);
        lifeExpectancyData.put("Украина_М", 67.6);
        lifeExpectancyData.put("Украина_Ж", 77.1);
        // Добавьте другие страны
    }

    public LifeStatistics(UserProfile userProfile) {
        this.userProfile = userProfile;
        calculateStatistics();
    }

    private void calculateStatistics() {
        LocalDate birthDate = userProfile.getBirthDate();
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        yearsLived = period.getYears();
        monthsLived = yearsLived * 12 + period.getMonths();
        daysLived = ChronoUnit.DAYS.between(birthDate, currentDate);
        weeksLived = daysLived / 7;

        lifeExpectancy = calculateWeightedLifeExpectancy();
        percentLived = (yearsLived / lifeExpectancy) * 100;
        daysLeft = (long) (lifeExpectancy * 365.25) - daysLived;
    }

    private double calculateWeightedLifeExpectancy() {
        List<CountryPeriod> periods = userProfile.getCountryPeriods();
        if (periods.isEmpty()) {
            String key = "Германия_" + userProfile.getGender(); // Значение по умолчанию
            return lifeExpectancyData.getOrDefault(key, 75.0);
        }

        double totalWeightedExpectancy = 0.0;
        long totalDaysLived = 0;

        for (CountryPeriod period : periods) {
            LocalDate start = period.getStartDate();
            LocalDate end = period.getEndDate() != null ? period.getEndDate() : LocalDate.now();
            long daysInCountry = ChronoUnit.DAYS.between(start, end);

            String key = period.getCountry() + "_" + userProfile.getGender();
            double expectancy = lifeExpectancyData.getOrDefault(key, 75.0);

            totalWeightedExpectancy += expectancy * daysInCountry;
            totalDaysLived += daysInCountry;
        }

        return totalWeightedExpectancy / totalDaysLived;
    }

    // Геттеры для параметров статистики

    public long getYearsLived() { return yearsLived; }
    public long getMonthsLived() { return monthsLived; }
    public long getWeeksLived() { return weeksLived; }
    public long getDaysLived() { return daysLived; }
    public double getPercentLived() { return percentLived; }
    public long getDaysLeft() { return daysLeft; }
    public double getLifeExpectancy() { return lifeExpectancy; }
}
