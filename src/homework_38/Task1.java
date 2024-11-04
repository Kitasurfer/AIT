package homework_38;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 04-11-2024
 */
/*

 */
public class Task1 {
    public static void main(String[] args) {

        Sportsman[] sportsman = {

                new Sportsman("Ivan", 23, 1000),
                new Sportsman("Oleg", 33, 800),
                new Sportsman("Artem", 18, 1200),
                new Sportsman("Semen", 40, 900),
                new Sportsman("Nikolay", 28, 1100),
                new Sportsman("Dmitry", 31, 850),
                new Sportsman("Alexey", 22, 1050),
                new Sportsman("Mikhail", 27, 950),
                new Sportsman("Andrey", 35, 1150),
                new Sportsman("Sergey", 29, 1020)
        };

        Arrays.asList(sportsman).forEach(System.out::println);
        Arrays.sort(sportsman);
        System.out.println("Сортировка по имени");
        Arrays.asList(sportsman).forEach(System.out::println);



        System.out.println("Сортировка по возрасту");
        Arrays.sort(sportsman, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman man1, Sportsman man2) {
                return Integer.compare(man1.getAge(), man2.getAge());
            }
        });
        Arrays.asList(sportsman).forEach(System.out::println);

        System.out.println("\nСортировка по рейтингу");
        Arrays.sort(sportsman, new ScoreComparator());
        Arrays.asList(sportsman).forEach(System.out::println);

    }

}