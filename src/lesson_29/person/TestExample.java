package lesson_29.person;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // Метод, который выполняется перед каждым тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Metod BeforeEach");
    }

    // Аннотация указывает, что метод является тестом
    @Test
    public void testAddition() {
        int result = 2 + 2;

        // Ожидаемое значение 4
        // Реальное значение в переменной result

        // Методы проверки утверждений
        // assertEquals(expected, actual) - проверяет, равны ли два значения
        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(5, result); // тест будет пройден, если ожидаемый результат
        // не совпадет с фактическим
        Assertions.assertTrue(result >= 4); // проверка, что условие верно, возвращает true
        assertFalse(result >= 5); // проверка, что условие возвращает false
        assertNull(null);
        assertNotNull("String");
    }

    // Отключенный тестовый метод (не будет выполнен)
    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Пустой тестовый метод считается пройденным,
        // если в методе нет ложного утверждения.
    }

    // Параметризованный тест
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruits) {
        assertTrue(fruits.length() > 2); // Проверка, что длина строки больше 2
    }
}
