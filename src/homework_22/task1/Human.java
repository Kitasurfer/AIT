package homework_22.task1;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
class Human {

    protected int speed = 10;
    protected int rest = 15;
    protected String name = "Человек";

    public void run() {
        System.out.println(this.name + " бежит со скоростью: " + this.speed);
        rest();
    }

    public void rest() {
        System.out.println(this.name + " Время для отдыха: " + this.rest + " км/ч.");
    }
}
