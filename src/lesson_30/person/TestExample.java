package lesson_30.person;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }
    /*
    @BeforeAll - метод выполняется только один раз перед выполнение первого теста
    @AfterEach - выполняется после КАЖДОГО тестовым методом
    @AfterAll - метод выполняется только один раз после выполнение всех тестовых методов
    @Disabled - указывает, что тест отключен и выполняться не будет
    @Nested - позволяет создать вложенный тестовый класс. Может быть использована для логической группировки тестовых методов
     */


    // Указывает, что метод является тестовым. Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test Addition");
        int result = 2 + 2;

        // Ожидаемое значение 4.
        // Реальное значение в переменой result

        // Методы проверки утверждений
        // assertEquals(expected, actual) - проверяет, равны ли два значения
        Assertions.assertEquals(4, result); // проверяет равны ли два значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если "неожидаемый результат" не совпадает с фактическим
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно (условие возвращает true)
        assertFalse(result > 4); // проверяет, что условие ложно (условие возвращает false)
        assertNull(null); // Проверяет, что объект равен null
        assertNotNull("String"); // Проверяет, что объект не равен null
    }


    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Пустой тестовый метод считается пройденным.
        // Если в методе нет ложного утверждения
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    void testInts(int value) {
        System.out.println("curent value" + value);
        Assertions.assertTrue(value > -5);
    }

    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSource(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // источник данных файл CSV
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    void testCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(String fruit) {
        System.out.println(fruit);
        assertNotNull(fruit);

    }

    // Stream поток данных передается и обрабатывается постепенно (поставщик данных)
    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "cherry");

    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSource2(int value) {
        System.out.println("curent value" + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -1, 4, 5);
    }

    @ParameterizedTest
    @MethodSource("complexDataProvider")
    void testWithComplexData(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertTrue(fruit.length() > 3 && rank > 0);
    }

    static Stream<Arguments> complexDataProvider() {
        return Stream.of(
                Arguments.of("apple", 1, true),
                Arguments.of("banana", 2, false),
                Arguments.of("cherry", 3, true)
        );
    }


    @ParameterizedTest
    @ValueSource(strings = {"orange", "kiwi", "pear"})
    void testWithStringValues(String fruit) {
        System.out.println("Fruit: " + fruit);
        assertNotNull(fruit);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 20})
    void testWithIntValues(int number) {
        System.out.println("Number: " + number);
        assertTrue(number % 5 == 0);
    }


    @ParameterizedTest
    @CsvSource({
            "apple, 1",
            "banana, 2",
            "grape, 3"
    })
    void testWithDifferentCsvSource(String fruit, int rank) {
        System.out.println(fruit + " | " + rank);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    void testCsvFileSource(int firstInt, int secondInt, double thirdDouble) {
        System.out.println("First: " + firstInt + " | Second: " + secondInt + " | Third: " + thirdDouble);
        assertTrue(firstInt > 0 && secondInt > 0 && thirdDouble > 0);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testDataArguments3(int value, int expected, boolean isEquals) {
        System.out.println(value + "|" + expected + "|"+ isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, false),
                Arguments.of(2, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person, String newEmail) {
        System.out.println(person);
        System.out.println(newEmail);
    }

    static Stream<Arguments> testPersonsData() {
        return Stream.of(
                Arguments.of(new Person("test@mail.com", "pas!RDghjdv,4"), "new123@mail.com"),
                Arguments.of(new Person("invalid.mail.com ", "password"), "mail.test.com")

        );
    }




}
