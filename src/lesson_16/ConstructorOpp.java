package lesson_16;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 01-10-2024
*/

import lesson_15.Cat;

/*

 */
public class ConstructorOpp {
    public static void main(String[] args) {
        Cat catVar = new Cat();
        /* 1. Создается ссылка на который будет храниться в этой переменной
        2. Вызывается конструктор для инициализации полей объекта

         */
        catVar.whoAmI();
        System.out.println(catVar.name);

        catVar.name = "Jack";
        System.out.println(catVar.name);
        Cat barsik = new Cat("Barsik", "gray", 2);
        barsik.whoAmI();
        System.out.printf("name: " + barsik.name + ",");
        System.out.printf(" color: " + barsik.color + ",");
        System.out.printf(" age: " + barsik.age + ",");
        barsik.age = 12;

        Cat cat2 = new Cat("Murzik: ", "blue: ", 3);
        cat2.whoAmI();

        Cat catClone = cat2;
        catClone.whoAmI();

        cat2.age = 100;
        cat2.whoAmI();
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; //если разкомментировать - программа завершается аварийно
        // нельзя вызвать присвоить значение Полю и т.д.
        if (catClone != null) {
            System.out.printf(catClone.name);
            catClone.whoAmI();
        }

    }

}
