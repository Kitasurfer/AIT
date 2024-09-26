package lesson_05;

/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */
public class HomeWork_05_2 {
    public static void main(String[] args) {
        String str1 = "Java ";
        String str2 = "is ";
        String str3 = "a ";
        String str4 = "powerful ";
        String str5 = "language. ";

        String result = str1 + str2 + str3 + str4 + str5; // Способ 1
        System.out.println("Cпособ 1: " + result);
        System.out.println("Длинна строки: " + result.length());

        String sentence2 = str1.concat(str2).concat(str3).concat(str4).concat(str5); // Способ 2
        System.out.println("Способ 2: " + sentence2);
        System.out.println("Длина строки: " + sentence2.length());
/*
Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */
        String modifiedResult = result.replace("powerful", "super"); // Заменяем слова
        System.out.println("После замены: " + modifiedResult);

        boolean containsAge = modifiedResult.contains("age");
        System.out.println("Содержит ли строка 'age': " + containsAge);



    }
}
/*
Cпособ 1: Java is a powerful language.
Длинна строки: 29
Способ 2: Java is a powerful language.
Длина строки: 29
После замены: Java is a super language.
Содержит ли строка 'age': true

Process finished with exit code 0
 */