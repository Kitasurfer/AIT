package lesson_21;

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 10-10-2024
*/

public class Passenger {
    private static int counterId;  // Статическое поле для отслеживания уникальных ID пассажиров

    private final int id;  // Уникальный идентификатор пассажира
    private String name;  // Имя пассажира

    // Конструктор, который принимает имя пассажира и назначает уникальный ID
    public Passenger(String name) {
        this.name = name;
        this.id = ++counterId;  // Увеличиваем счетчик и присваиваем его в качестве ID
    }

    // Метод для представления объекта Passenger в виде строки
    public String toString() {
        return "Passenger id: " + id + " name: " + name;
    }

    // Геттер для получения уникального ID пассажира
    public int getId() {
        return id;
    }

    // Геттер для получения имени пассажира
    public String getName() {
        return name;
    }

    // Сеттер для изменения имени пассажира
    public void setName(String name) {
        this.name = name;
    }
}
