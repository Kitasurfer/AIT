package homework_03;


/*
Task 3 * (Опционально)
Найдите в Интернете данные по температуре в вашем городе за прошедшую
неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
 */

public class HomeWork_03_4 {
    public static void main(String[] args) {
        // Температуры за каждый день недели
        double day1 = 15.0;
        double day2 = 16.5;
        double day3 = 14.2;
        double day4 = 17.8;
        double day5 = 18.0;
        double day6 = 16.9;
        double day7 = 15.4;

        // Сумма всех температур
        double total = day1 + day2 + day3 + day4 + day5 + day6 + day7;

        // Среднюя температура сумма всех / 7
        double averageTemperature = total / 7;

        // Выводим результат
        System.out.println("Средняя температура за неделю: " + averageTemperature + " градусов");
        /* Ответ
        Средняя температура за неделю: 16.25714285714286 градусов
         */
    }
}
