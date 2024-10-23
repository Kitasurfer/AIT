package lesson_30.person;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String email;
    private String password;

    // Список распространенных паролей для предотвращения их использования
    private final List<String> commonPasswords = Arrays.asList(
            "password", "123456", "123456789", "qwerty", "abc123", "password123", "111111", "123123");

    // Конструктор класса Person
    public Person(String email, String password) {
        setEmail(email);  // Устанавливаем email через сеттер с валидацией
        setPassword(password);  // Устанавливаем пароль через сеттер с валидацией
    }

    // Геттер для email
    public String getEmail() {
        return email;
    }

    // Сеттер для email с валидацией
    public void setEmail(String email) {
        // Если email валиден, устанавливаем его
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email address: " + email);
        }
    }

    // Геттер для password
    public String getPassword() {
        return password;
    }

    // Сеттер для password с валидацией
    public void setPassword(String password) {
        // Проверка пароля на валидность и соответствие высоким стандартам
        if (isPasswordValid(password)) {
            if (!isPasswordCommon(password)) {
                this.password = password;
            } else {
                System.out.println("Password is too common. Choose another.");
            }
        } else {
            System.out.println("Invalid password.");
        }
    }

    /*
     * Метод проверки валидности email
     * Условия:
     * 1. Должна присутствовать "@" и только одна
     * 2. Точка должна находиться после "@" (в доменной части)
     * 3. После последней точки должно быть не менее 2 символов
     * 4. Разрешены буквы, цифры, '-', '_', '.', '@'
     * 5. До "@" должен быть хотя бы один символ
     * 6. Первый символ должен быть буквой
     * 7. Недопустимо наличие двух точек подряд
     * 8. Email не должен начинаться с символов "-", "_" или "."
     */
    private boolean isEmailValid(String email) {
        // Регулярное выражение для проверки валидности email
        String emailRegex = "^[A-Za-z][\\w.-]*[A-Za-z0-9]@[A-Za-z0-9-]+\\.[A-Za-z]{2,6}$";

        // Проверяем соответствие email регулярному выражению
        if (!email.matches(emailRegex)) {
            return false;  // Если не соответствует регулярному выражению, email невалиден
        }

        // Дополнительная проверка на наличие двух точек подряд
        if (email.contains("..")) {
            return false;  // Если найдены две точки подряд, email невалиден
        }

        return true;  // Все проверки пройдены, email валиден
    }

    /*
     * Метод проверки валидности пароля
     * Условия:
     * 1. Длина пароля должна быть не менее 12 символов
     * 2. Должна быть хотя бы одна цифра
     * 3. Должна быть хотя бы одна маленькая буква
     * 4. Должна быть хотя бы одна заглавная буква
     * 5. Должен присутствовать хотя бы один специальный символ (!%$@&*()[].,-)
     * 6. Пароль не должен содержать пробелы
     */
    private boolean isPasswordValid(String password) {
        // Если пароль null или меньше 12 символов, он невалиден
        if (password == null || password.length() < 12) {
            System.out.println("Password should be at least 12 characters long");
            return false;
        }

        // Флаги для проверки разных условий
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasNoSpaces = true;

        String specialChars = "!%$@&*()[].,-";

        // Перебираем символы пароля
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;  // Проверка на наличие цифры
            if (Character.isUpperCase(c)) hasUpperCase = true;  // Проверка на заглавную букву
            if (Character.isLowerCase(c)) hasLowerCase = true;  // Проверка на маленькую букву
            if (specialChars.contains(String.valueOf(c))) hasSpecialChar = true;  // Проверка на специальный символ
            if (Character.isWhitespace(c)) hasNoSpaces = false;  // Проверка на пробелы
        }

        // Проверяем, что пароль соответствует всем требованиям
        if (!hasNoSpaces) {
            System.out.println("Password should not contain spaces");
        }

        // Выводим результат для отладки (можно убрать в продакшн-коде)
        System.out.printf("%s | %s | %s | %s | No spaces: %s\n", hasDigit, hasUpperCase, hasLowerCase, hasSpecialChar, hasNoSpaces);

        return hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar && hasNoSpaces;
    }

    // Проверка, является ли пароль распространенным
    private boolean isPasswordCommon(String password) {
        return commonPasswords.contains(password.toLowerCase());
    }

    // Метод для удобного вывода информации о объекте Person
    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
