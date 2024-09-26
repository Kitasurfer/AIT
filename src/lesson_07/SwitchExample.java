package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

public class SwitchExample {
    public static void main(String[] args) {
        // Пример с использованием if-else
        int x = 35;

        // Условный оператор if-else для проверки значения переменной x
        if (x == 5) {
            // Этот блок выполнится, если x равен 5
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            // Этот блок выполнится, если x равен 7
            System.out.println("if-else: x равен 7");
        } else {
            // Этот блок выполнится, если ни одно из предыдущих условий не выполнено
            System.out.println("else: что-то другое");
        }

        // Оператор switch для проверки значения переменной x
        switch (x) {
            case 5:
                // Этот блок выполнится, если x равен 5
                System.out.println("switch: x равен 5");
                break; // break предотвращает выполнение последующих case'ов
            case 7:
                // Этот блок выполнится, если x равен 7
                System.out.println("switch: x равен 7");
                break; // break предотвращает выполнение последующих case'ов
            default:
                // Этот блок выполнится, если ни одно из условий case не выполнено
                System.out.println("switch: что-то другое");
                break;
        }

        // Теперь изменим значение переменной x и покажем другой пример
        x = 9;

        // Пример с использованием if-else для нового значения x
        if (x == 5) {
            System.out.println("x равен 5");
        } else if (x > 5 && x < 10) {
            System.out.println("if x между 5 и 10");
        } else {
            System.out.println("if x больше или равен 10");
        }

        // Пример с использованием switch-case для нового значения x
        switch (x) {
            case 5:
                System.out.println("switch x равен 5");
                break;
            case 10:
                System.out.println("switch x равен 10");
                break;
            default:
                System.out.println("switch Значение x неизвестно");
                break;
        }
    }
}
