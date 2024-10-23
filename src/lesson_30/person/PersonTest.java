package lesson_30.person; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 23-10-2024
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/*

 */
public class PersonTest {

    Person person;
    String startEmail = "hans@test.com";
    String startPassword = "qwerty1Q!";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testinvalidEmailData(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",       // Нет символа "@"
                "test@mail.net",      // Валидный email, должен проходить
                "test@mai@l.net",     // Два символа "@"
                "test@mail.n.et",     // Слишком много точек
                "test@mailn.et",      // Валидный email
                "test@mail.com",      // Валидный email
                "user.name@test.com", // Валидный email
                "user-name@test.co",  // Валидный email
                "username@domain.org",// Валидный email
                "user+name@domain.com",// Валидный email
                "@name@domain.com",   // Один символ до @
                "_name@domain.com",   // Начало с недопустимого символа "_"
                "-name@domain.com"    // Начало с недопустимого символа "-"
        );
    }
}
