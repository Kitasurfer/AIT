package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

public class Test_X {
    public static void main(String[] args) {
     int x = 10;

// Пример if-else
     if (x == 5) {
      System.out.println("x равен 5");
     } else if (x > 5 && x < 10) {
      System.out.println("x между 5 и 10");
     } else {
      System.out.println("x больше или равен 10");
     }

// Пример switch-case
     switch (x) {
      case 5:
       System.out.println("x равен 5");
       break;
      case 10:
       System.out.println("x равен 10");
       break;
      default:
       System.out.println("Значение x неизвестно");
     }

    }
        // Ваш код здесь
    }
