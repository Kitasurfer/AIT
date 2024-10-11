package lesson_21;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 10-10-2024
*/

public class Autopilot {
    private String softwareVersion;  // Версия программного обеспечения автопилота
    private Autobus autobus;  // Ссылка на автобус, к которому прикреплен автопилот

    // Конструктор, принимающий версию ПО
    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    // Геттер для получения автобуса, к которому прикреплен автопилот
    public Autobus getAutobus() {
        return autobus;
    }

    // Сеттер для назначения автобуса автопилоту
    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    // Метод для представления автопилота в виде строки
    public String toString() {
        return "Autopilot: { SV: " + softwareVersion + "}";
    }

    // Геттер для получения версии ПО
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    // Сеттер для изменения версии ПО автопилота
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
