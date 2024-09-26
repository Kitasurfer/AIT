package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

import java.util.Random;

public class HomeWork_07_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int minGrade = 0;
        int maxGrade = 12;
        int grade = random.nextInt(minGrade, maxGrade + 1);
        int time = 45;
        switch (grade) {
            case 10, 11, 12:
                time = time + 60;
                break;
            case 7, 8, 9:
                time = time + 45;
                break;
            case 4, 5, 6:
                time = time + 15;
                break;
            case 3:
                time = time - 30;
                break;
            default:
                time = 0;
                System.out.println("Сегодня нельзя смотреть ТВ");
                break;
        }
        System.out.println("Оценка, которую он получил в школе " + grade);
        System.out.println("Сколько времени ребенок заработал " + time);
        if (time > 60) {
            System.out.println("Проконтролируйте чтобы ребенок смотрел ТВ не больше 60 мин");
        }

    }
}
