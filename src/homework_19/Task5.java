package homework_19;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 08-10-2024
*/

import HomeWork_18.Dog;

import java.util.Random;

/*
- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */
public class Task5 {
    public static void main(String[] args) {
        Random random = new Random(); // Создаем объект Random для генерации случайных чисел

        Dog[] dogs = new Dog[5]; // Создаем массив из 5 собак

        for (int i = 0; i < dogs.length; i++) { // Заполняем собаками с случайной высотой прыжка
            int randomJump = 30 + random.nextInt(51); // Прыгаем
            dogs[i] = new Dog("Dog_" + (i + 1), randomJump); // Создаем объект с уникальным именем и прыжком
        }
        
        int[] barriers = new int[7]; // Массив из 7 барьеров
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = 70 + random.nextInt(101); // Генерим случайные значения
        }

        for (int i = 0; i < dogs.length; i++) { // Собаки преодолеваю барьер
            Dog value = dogs[i]; // Получаем собаку из массива
            for (int j = 0; j < barriers.length; j++) {
                int barrier = barriers[j];
                value.jumpBarrier(barrier); // Преодолевают барьер jumpBarrier
            }
        }
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " прыгнула " + dog.getCount() + " раз"); // Через getCount узнаем
            // сколько собака преодолела барьеров
        }
    }
}
