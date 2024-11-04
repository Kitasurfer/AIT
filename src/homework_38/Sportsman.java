package homework_38;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 04-11-2024
 */
/*

 */
public class Sportsman implements Comparable<Sportsman> {

    private  String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Sportsman man) {
        return this.name.compareTo(man.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("Sportsman{name='%s', age=%d, score=%d}", name, age, score);
    }
}
