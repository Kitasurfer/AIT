package lesson_24.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Создаем коллекцию для объектов типа Printable
        List<Printable> items = new ArrayList<>();

        // Добавляем книги
        items.add(new Book("Война и мир", "Лев Толстой"));
        items.add(new Book("Философия Java", "Брюс Эккель"));
        items.add(new Book("Гарри Поттер", "Дж. К. Роулинг"));
        items.add(new Book("Преступление и наказание", "Ф.М. Достоевский"));

        // Добавляем журналы
        items.add(new Journal("Cosmo", 154));
        items.add(new Journal("National Geographic", 202));
        items.add(new Journal("Forbes", 300));
        items.add(new Journal("Time", 99));
        items.add(new Journal("Vogue", 189));

        // Печатаем информацию о конкретной книге с возможными ошибками в названии
        printSpecificBook(items, "Гар Потер");  // Опечатка в названии
    }

    // Метод для поиска и печати конкретной книги с учетом расстояния Левенштейна
    public static void printSpecificBook(List<Printable> items, String inputTitle) {
        Book closestMatch = null;
        int minDistance = Integer.MAX_VALUE;

        for (Printable item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                int distance = calculateLevenshteinDistance(book.title, inputTitle);  // Вычисляем расстояние Левенштейна

                if (distance < minDistance) {
                    minDistance = distance;
                    closestMatch = book;
                }
            }
        }

        // Если нашли книгу с минимальным расстоянием
        if (closestMatch != null && minDistance <= 3) {  // Допустим, максимальная дистанция - 3 символа
            closestMatch.print();
        } else {
            System.out.println("Книга с названием, похожим на '" + inputTitle + "', не найдена.");
        }
    }

    // Реализация алгоритма Левенштейна для вычисления расстояния между строками
    public static int calculateLevenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
