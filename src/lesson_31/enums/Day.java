package lesson_31.enums;

public enum Day {
    MONDAY("Понедельник", 1),    // Понедельник
    TUESDAY("Вторник", 2),   // Вторник
    WEDNESDAY("Среда", 3), // Среда
    THURSDAY("Четверг", 4),  // Четверг
    FRIDAY("Пятница", 5),    // Пятница
    SATURDAY("Суббота", 6),  // Суббота
    SUNDAY("Воскресенье", 7);   // Воскресенье

    private String russian;
    private int dayOfWeek;

    public String getRussian() {
        return russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;

    }
    public String testMethod() {
        return String.format("%s - русский перевод: %s, номер дня недели: %d",
                this.name(), this.russian, this.dayOfWeek);
    }
}
