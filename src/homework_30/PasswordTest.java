package homework_30;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 23-10-2024
*/

/*
Task 1
Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
 */

import lesson_27.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PasswordTest {
    Person person;

    @BeforeEach
    void setUp() {
        // объект инициализируем с валидным email
        person = new Person("valid@test.com", "ValidPassword1!");

    }

    // Тесты валидных паролей
    @ParameterizedTest
    @MethodSource("validPasswordProvider")


    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());

    }

    // Источник данных для валидных паролей
    static Stream<String> validPasswordProvider() {
        return Stream.of(
                "StrongPass1!",      // Стандартный пароль
                "Valid123!Abc",      // с разными символами
                "Complex$P!a#ssword1", // пароль с символами
                "Passw0rd@123",      // пароль с цифрами заглавными и специальными символами
                "My$Super123Passw345ordfghf!,"// длинный пароль
        );


    }



    // Тесты для невалидных паролей
    @ParameterizedTest
    @MethodSource("invalidPasswordProvider")


    void testInvalidPasswordSet(String invalidPassword) {
        String previousPassword = person.getPassword(); // Сохраняем старый пароль
        person.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, person.getPassword()); // пароль не изменился
        Assertions.assertEquals(previousPassword, person.getPassword());   // старый пароль остался
    }

    // для невалидных паролей
    static Stream<String> invalidPasswordProvider() {
        return Stream.of(
                "short1!",            // короткий пароль
                "NoSpecial123",       // Нет специального символа
                "NoDigit!",           // Нет цифры
                "NOLOWERCASE123!",    // Нет строчных букв
                "nouppercase123!",    // Нет заглавных букв
                "Password with space",//с пробелом
                "123456789012",       // Только цифры нет букв и специальных символов
                "passwordpassword",   // Нет цифр и заглавных букв
                "PASSWORDPASSWORD!",  // Нет цифр и маленьких букв
                "abcABC123"// Нет спец символа
        );


    }


}
