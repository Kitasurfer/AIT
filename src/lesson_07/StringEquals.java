package lesson_07;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // Сравнивается значение которых хранятся в переменных
        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2 " + b1); // true
        System.out.println("str1 == str3 " + (str1 == str3)); // false
        System.out.println("str1 == str4 " + (str1 == str4)); // false

        // Для сравнения строк по их значение мы должны использовать метод Equals
        boolean b2 = str1.equals(str2); // Сравнение по значению строк (Не по ссылкам)

        System.out.println("str1.equals(str2) -> " + b2); // true
        System.out.println("str1.equals(str4) -> " + str1.equals(str4)); // true, сравнение значений
        System.out.println("str1.equals(str3) -> " + str1.equals(str3)); // false, так как разные регистры
        System.out.println("str1.equalsIgnoreCase(" + str3 + ") -> " + str1.equalsIgnoreCase(str3)); // true, игнорирование регистра


        String newstr1 = str1.toLowerCase();
        String newstr3 = str3.toLowerCase();
        System.out.println(newstr1.equals(newstr3));
    }
}
