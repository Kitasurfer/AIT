package homework_38;

import java.util.Comparator;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 04-11-2024
 */
/*

 */
public class ScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Integer.compare(s1.getScore(), s2.getScore());
    }
}
