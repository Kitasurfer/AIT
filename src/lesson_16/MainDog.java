package lesson_16; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 01-10-2024
*/

public class MainDog {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);

        // Красиво выводим информацию о собаке с переводом строки
        String info = dog.info();
        System.out.printf("%s\n", info); // Используем перевод строки \n для красивого вывода

        // Симуляция бега
        dog.run();
        dog.run();
        dog.run();
        dog.run();

        // Вывод обновленной информации после пробежек с переводом строки
        System.out.printf("%s\n", dog.info());
    }
}
