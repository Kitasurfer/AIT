package lesson_21;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 10-10-2024
*/

public class BusDriver {
    private static int idCounter = 1;  // Статическое поле для генерации уникальных ID
    private final int id;  // Уникальный идентификатор водителя

    private String name;  // Имя водителя
    private String licenseNumber;  // Номер лицензии водителя

    // Конструктор, принимающий имя и номер лицензии водителя
    public BusDriver(String name, String licenseNumber) {
        this.id = idCounter++;  // Присваиваем уникальный ID
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Метод для представления объекта BusDriver в виде строки
    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver :{");
        sb.append("id: ").append(id);  // Добавляем ID водителя
        sb.append(", name: ").append(name);  // Добавляем имя водителя
        sb.append("}");

        return sb.toString();  // Возвращаем итоговую строку
    }

    // Геттер для получения ID водителя
    public int getId() {
        return id;
    }

    // Геттер для получения имени водителя
    public String getName() {
        return name;
    }

    // Геттер для получения номера лицензии водителя
    public String getLicenseNumber() {
        return licenseNumber;
    }

    // Сеттер для изменения имени водителя
    public void setName(String name) {
        this.name = name;
    }

    // Сеттер для изменения номера лицензии водителя
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
