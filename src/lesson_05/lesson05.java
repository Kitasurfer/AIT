package lesson_05;


public class lesson05 {
    public static void main(String[] args) {
        String string = "Java";

        System.out.println(string);

        // Получить количество символов в строке (длина строки)
        int length = string.length();
        System.out.println("length " + length);

        // Метод позволяет перевести все символы строки в верхний регистр
        System.out.println(string.toUpperCase());
        System.out.println("string: " + string);

        // String неизменяемая (immutable)
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какую-то переменную
        String stringUpper = string.toUpperCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        // Результат работы метода мы можем сохранить в ту же самую переменную. Переписав её результатом метода.
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringUpper: " + stringUpper);

        System.out.println("+++++++++++++++++++++++++++");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        //
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println((1 + 3) + (" * ") + (2 + 3));

        // Конкатиннация 2
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2: " + concatStr2);

        // Цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat(" . ");
        System.out.println("concatStr3: " + concatStr3);

        // Конкатиннация 3
        String concatStr4 = String.join(" --- ", str1, str3, "java");
        System.out.println("concatStr4: " + concatStr4);

        int id = 1;
        int id2 = 2;
        String string2 = "Hello" + id + id2;
        System.out.println("string2: " + string2);

        System.out.println("My age is: " + id2);

        System.out.println("_____________________________");

        String digits = "0123456789hhk";
        System.out.println("digits.length(): " + digits.length());

        // Взять символ из строки  по его индексу
        char firstChar = digits.charAt(0); // взять символ под номером 0 из строки digits
        // Независимо от фактической длинны строки, индекс последнего символа ВСЕГДА будет равен
        // (длинна -1)
        char lastChar = digits.charAt(9);
        char lastChar1 = digits.charAt(digits.length() - 1);

        System.out.println("firstChar: " + firstChar);
        System.out.println(digits.charAt(4));
        System.out.println("lastChar: " + lastChar);
        System.out.println("lastChar1: " + lastChar1);

        // Выделение подстроки
        String subString = digits.substring(2);
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits); // Изначальная строка остается неизменной


    }
}
