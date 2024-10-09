package lesson_20.transpor; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 09-10-2024
*/

/*

 */
public class Bus extends Vehicle {

    private int capacity; // Поле для хранения вместимости автобуса
    public int countPassengers; // Поле для хранения текущего количества пассажиров

    // Конструктор класса Bus, который принимает модель, год и вместимость автобуса
    public Bus(String model, int year, int capacity) {
        // Необходимо создать объект родителя.
        super(model, year); // Вызываем конструктор родительского класса Vehicle, передавая модель и год выпуска
        this.capacity = capacity; // Инициализируем поле вместимости автобуса
    }

    // Метод для добавления пассажира в автобус
    public boolean takePassenger() {
        // Проверить, есть ли свободное место в автобусе
        if (countPassengers < capacity) { // Если текущее количество пассажиров меньше вместимости
            countPassengers++; // Увеличиваем количество пассажиров
            System.out.println("Пассажир зашел в автобус: " + this.getModel()); // Выводим сообщение о том, что пассажир зашел
            return true; // Возвращаем true, если пассажир успешно добавлен
        }
        // Если в автобусе нет свободных мест
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров.\n", this.getModel(), countPassengers); // Выводим сообщение об отсутствии мест
        return false; // Возвращаем false, если пассажира не удалось добавить
    }

    // Метод для высадки пассажира из автобуса
    public boolean dropPassenger() {
        // Проверить, есть ли пассажиры в автобусе
        if (countPassengers > 0) { // Если количество пассажиров больше 0
            countPassengers--; // Уменьшаем количество пассажиров
            System.out.println("Пассажир вышел из автобуса: " + this.getModel()); // Выводим сообщение о том, что пассажир вышел
            return true; // Возвращаем true, если пассажир успешно высажен
        }
        // Если в автобусе нет пассажиров
        System.out.printf("В автобусе %s больше нет пассажиров для высадки.\n", this.getModel()); // Выводим сообщение, что нет пассажиров для высадки
        return false; // Возвращаем false, если нет пассажиров для высадки
    }

    // Метод для получения вместимости автобуса
    public int getCapacity() {
        return capacity; // Возвращаем значение поля capacity
    }

    // Метод для получения количества пассажиров в автобусе
    public int getCountPassengers() {
        return countPassengers; // Возвращаем текущее количество пассажиров
    }
}
