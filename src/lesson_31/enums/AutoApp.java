package lesson_31.enums;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 24-10-2024
*/

/*
    Основной класс приложения для работы с авто и перечислением цветов
 */
public class AutoApp {
    public static void main(String[] args) {
        // Создание объекта перечисления Color с значением RED
        Color color = Color.RED;
        System.out.println(color); // Вывод значения color

        // Создание объекта Auto с моделью "Model1" и цветом BLUE
        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto); // Вывод информации об объекте авто

        // Изменение цвета авто на RED
        auto.setColor(color);
        System.out.println(auto); // Вывод обновленной информации об авто

        // Разделитель для лучшего чтения вывода
        System.out.println("\n====================\n");

        // Получение всех возможных значений перечисления Color
        Color[] colors = Color.values();

        // Цикл для вывода всех значений перечисления Color
        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }

        // Получение значения перечисления по имени "RED"
        Color color1 = Color.valueOf("RED");
        System.out.println(color1); // Вывод значения color1

        // Получение имени значения перечисления (в виде строки)
        String name = Color.RED.name();
        System.out.println(name + "!"); // Вывод имени перечисления

        // Получение порядкового номера значения перечисления (начиная с 0)
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal); // Вывод порядкового номера для Color.GREEN

        if (auto.getColor() == Color.GREEN) {
            System.out.println("Green");

        } else {
            System.out.println("No Green");

            switch (color){
                case RED:
                    System.out.println("Красный.");
                    break;
                case GREEN:
                    System.out.println("Зеленый.");
                    break;
                default:
                    System.out.println("Какого-то другого цвета!");
            }
        }
    }
}
