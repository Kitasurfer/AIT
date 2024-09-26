package lesson_05;

public class lesson_05_01 {
    public static void main(String[] args) {
        // Пример с типами long и int
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("bigNumber: " + bigNumber);
        System.out.println("smallNumber: " + smallNumber);

        // Пример переполнения типа byte
        byte b1 = -128;
        b1 = (byte) (b1 + 4); // Происходит переполнение

        System.out.println("b1 после переполнения: " + b1);
    }
}
