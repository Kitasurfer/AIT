package lesson_43;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */
public class FunctionalInterfaces {
    public static void main(String[] args) {

        // Пример использования Consumer - функционального интерфейса для выполнения операций без возврата значения
        Consumer<String> print = System.out::println; // Создаем Consumer, который выводит строку в консоль
        print.accept("Hello"); // Вызываем Consumer, вывод: Hello

        List<String> items = List.of("apple", "banana", "cherry"); // Создаем неизменяемый список строк
        items.forEach(print); // Используем Consumer для вывода каждого элемента списка

        // Пример использования анонимного класса Consumer
        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Anonymous Consumer: " + s); // Вывод строки с пометкой "Anonymous Consumer"
            }
        };
        example.accept("Example"); // Вызов Consumer с аргументом "Example"

        // Лямбда-выражение Consumer
        Consumer<String> printLambda = str -> System.out.println(str); // Создаем Consumer в виде лямбда-выражения
        printLambda.accept("Hello Lambda"); // Вызываем Consumer, вывод: Hello Lambda

        Consumer<String> printLambda2 = str -> System.out.println("1. Lambda: " + str); // Лямбда с добавленным текстом
        printLambda2.accept("Hello Lambda2"); // Вывод: 1. Lambda: Hello Lambda2

        Consumer<String> printLambda3 = str2 -> System.out.println("2. " + str2 + "!"); // Лямбда с добавленным знаком "!"
        printLambda3.accept("Hello Lambda3"); // Вывод: 2. Hello Lambda3!

        Consumer<String> resultConsumer = printLambda.andThen(printLambda2); // Объединение двух Consumer
        resultConsumer.accept("Hello Consumer"); // Последовательно выводит оба Consumer

        System.out.println("\n===========Predicate================\n"); // Разделитель для вывода

        // Пример использования Predicate - интерфейса для проверки условий (возвращает boolean)
        Predicate<Integer> isEven = number -> number % 2 == 0; // Создаем предикат для проверки четности числа
        System.out.println(isEven.test(4)); // Проверка четности 4, вывод: true
        System.out.println(isEven.test(5)); // Проверка четности 5, вывод: false

        List<Integer> numbers = List.of(1, 2, 3, 4, 5); // Создаем список чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven) // Фильтруем только четные числа
                .collect(Collectors.toList()); // Сохраняем отфильтрованные числа в список
        System.out.println(evenNumbers); // Вывод: [2, 4]

        // Проверка строки на непустое значение
        Predicate<String> isNotEmpty = str -> !str.isEmpty(); // Предикат для проверки на непустую строку
        System.out.println("isNotEmpty.test(\"Hello Amigo!\") " + isNotEmpty.test("Hello Amigo!")); // Проверка строки

        // Создание списка чисел и фильтрация положительных и отрицательных чисел
        List<Integer> numbers2 = List.of(-1, 2, 3, 4, 10, -10, -45, 11, 17, 24, 0); // Список чисел
        List<Integer> positiveNumbers = filterByPredicate(numbers2, num -> num >= 0); // Фильтруем положительные числа
        List<Integer> negativeNumbers = filterByPredicate(numbers2, num -> num < 0); // Фильтруем отрицательные числа
        List<Integer> evenPositiveNumbers = filterByPredicate(numbers2, num -> num > 0 && num % 2 == 0); // Четные положительные числа
        List<Integer> oddNumbers = filterByPredicate(numbers2, num -> num % 2 != 0); // Фильтруем нечетные числа

        // Вывод всех положительных, отрицательных, четных и нечетных чисел
        System.out.println("All positive numbers: " + positiveNumbers); // Вывод всех положительных чисел
        System.out.println("All negative numbers: " + negativeNumbers); // Вывод всех отрицательных чисел
        System.out.println("Even positive numbers: " + evenPositiveNumbers); // Вывод всех четных положительных чисел
        System.out.println("All odd numbers: " + oddNumbers); // Вывод всех нечетных чисел

        // Комбинирование предикатов с использованием and и or
        Predicate<String> isLengthGreater6 = str -> str.length() > 6; // Предикат для проверки длины строки > 6
        Predicate<String> containsJava = str -> str.contains("Java"); // Предикат для проверки наличия "Java"
        Predicate<String> combinedPredicate = isLengthGreater6.or(containsJava); // Комбинируем предикаты с помощью or
        String testString = "Java!";
        System.out.println("combinedPredicate.test(testString): " + combinedPredicate.test(testString)); // Проверка строки

        Predicate<String> negate = containsJava.negate(); // Используем negate для отрицания условия
        System.out.println("negate.test(testString): " + negate.test(testString)); // Проверка условия negate

        System.out.println("\n===========Function================\n"); // Разделитель для вывода

        // Пример использования Function - интерфейса, который принимает значение и возвращает результат
        Function<String, Integer> stringLength = String::length; // Создаем Function для получения длины строки
        int length = stringLength.apply("Hello"); // Вычисляем длину строки "Hello"
        System.out.println("Length of 'Hello': " + length); // Вывод: 5

        List<String> names = List.of("Alice", "Bob", "Charlie"); // Список имен
        List<Integer> nameLengths = names.stream()
                .map(String::length) // Преобразуем каждое имя в его длину
                .collect(Collectors.toList()); // Сохраняем длины в список
        System.out.println("Lengths of names: " + nameLengths); // Вывод: [5, 3, 7]

        // Пример использования Function для преобразования строки в верхний регистр
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("Hello 2 Amigo!")); // Преобразует "Hello 2 Amigo!" в верхний регистр

        // Пример использования Function для добавления "!!!" к строке через метод test
        Function<String, String> concatenate = FunctionalInterfaces::test; // Используем метод test для добавления "!!!"
        String result1 = concatenate.apply("Hello, World"); // Применяем к строке "Hello, World"
        System.out.println(result1); // Вывод: Hello, World!!!

        // Комбинирование функций с помощью andThen
        Function<String, String> combinedFunction = toUpperCase.andThen(concatenate); // Преобразуем в верхний регистр, затем добавляем "!!!"
        System.out.println(combinedFunction.apply("Test string")); // Вывод комбинированного результата

    }

    // Метод для добавления "!!!" к строке
    public static String test(String str) {
        return str + "!!!";
    }

    // Метод для фильтрации списка с использованием Predicate
    public static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>(); // Создаем новый список для хранения результата
        for (Integer integer : integers) { // Проходим по каждому числу в исходном списке
            if (predicate.test(integer)) { // Проверяем, удовлетворяет ли число предикату
                result.add(integer); // Если да, добавляем его в результат
            }
        }
        return result; // Возвращаем отфильтрованный список
    }
}
