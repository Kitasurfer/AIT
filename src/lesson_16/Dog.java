package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Метод для возврата информации о собаке
    String info() {
        return "I am dog " + name + ", my weight is " + weight + " kg\n"; // Добавляем kg для единицы измерения и перевод строки
    }

    // Метод для симуляции еды
    void eat() {
        System.out.println("Я кушаю, ням-ням!");
        weight++;
    }

    // Метод для симуляции бега
    void run() {
        /*
        1. Проверяем, может ли собака бежать.
        2. Если вес слишком мал, собака должна поесть перед тренировкой.
         */

        while (weight < 5) {
            System.out.println("Sorry! Хочу кушать, бежать не могу!");
            System.out.println("Нужно поесть, мой вес сейчас: " + weight + " кг\n");

            eat(); // Собака ест, если вес недостаточен
        }

        System.out.println("Я бегу!");
        weight -= 2; // Вес уменьшаем на 2 кг после пробежки
        System.out.println("Вес после пробежки: " + weight + " кг");
        System.out.println("===================\n"); // Разделитель для улучшения читаемости
    }
}
