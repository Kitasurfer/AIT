package lesson_22.animals;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
    Пример восходящего и нисходящего преобразования объектов в иерархии наследования.
 */
public class CastingExample {
    public static void main(String[] args) {
        // Восходящее преобразование (upcasting)
        // Создаем объект Cat и преобразуем его к типу Animal
        Animal animal = new Cat(); // Восходящее преобразование
        animal.voice(); // Вызывается переопределенный метод voice() из класса Cat


        // Пример toString() после восходящего преобразования
        System.out.println(animal.toString()); // Вывод: "Cat.toString"

        // Нисходящее преобразование (downcasting)
        // Преобразуем объект обратно к типу Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // Нисходящее преобразование
            cat.eat(); // Теперь можем вызвать метод eat(), который есть только у Cat
            cat.voice("purrs"); // Вызов перегруженного метода voice с параметром
        }

        // Пример создания других объектов животных
        Animal animal3 = new Dog();
        Animal animal4 = new Hamster();

        // Создаем массив животных и корректно индексируем его
        Animal[] animals = new Animal[3];
        animals[0] = animal3;
        animals[1] = animal4;
        animals[2] = new Cat(); // Инициализируем последний элемент массива

        // Вызываем методы voice() для каждого объекта в массиве
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        // Пример автоматического приведения int к double
        int i1 = 100;
        double d1 = i1;
        System.out.println(d1); // Вывод: 100.0

        // Пример явного приведения double к int
        double y = 10.50;
        int x = (int) y; // Приведение с потерей точности
        System.out.println(x); // Вывод: 10

        // Пример нисходящего преобразования
        Cat catLink;
        Animal animalLink = new Cat();
        catLink = (Cat) animalLink; // Нисходящее преобразование

        // Пример с ошибкой, если бы объект не был экземпляром подкласса
        Animal animal2 = new Animal();
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2; // Этот код не выполнится, так как animal2 — не Cat
        } else {
            System.out.println("animal2 не является объектом Cat, преобразование невозможно.");
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("sout: " + animals[i]);
                System.out.println(animals[i].getClass() + " instanceof Cat: " + (animals[i] instanceof Cat));

                Animal current = animals[i];

                if (animals[i] instanceof Cat) {
                    System.out.println(i + "-й индекс может быть безопасно приведен к Cat");
                    Cat tempCat = (Cat) current;
                    tempCat.eat();
                }

                System.out.println("\n=======Cast========\n");
            }
        }


    }
}
