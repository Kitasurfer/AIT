package homework_27;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 20-10-2024
*/

public class Person_HW {
    private String email;
    private String password;

    public Person_HW(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    // Валидация email
    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) return false;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            boolean isValidChar = Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) ||
                    ch == '-' ||
                    ch == '_' ||
                    ch == '.' ||
                    ch == '@';

            if (!isValidChar) return false;
        }

        if (indexAt == 0) return false;

        char firstChar = email.charAt(0);
        if (!Character.isAlphabetic(firstChar)) return false;

        return true;
    }

    // Валидация пароля
    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialSymbol = false;
        String specialSymbols = "!%$@&*()[].,-";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (Character.isLowerCase(ch)) hasLowerCase = true;
            if (specialSymbols.indexOf(ch) >= 0) hasSpecialSymbol = true;
        }

        return hasDigit && hasUpperCase && hasLowerCase && hasSpecialSymbol;
    }

    @Override
    public String toString() {
        return "Person_HW{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // Точка входа main для тестирования
    public static void main(String[] args) {
        // Создание объекта Person_HW с тестовыми данными
        Person_HW person = new Person_HW("test@example.com", "Password1!");
        System.out.println("Initial Person Details:");
        System.out.println(person);

        // Тестирование установки email
        System.out.println("\nSetting new email addresses:");
        person.setEmail("a1@email.de");
        System.out.println("Valid email set: " + person.getEmail());

        person.setEmail("a1@ema@il.de");
        System.out.println("Invalid email set attempt: " + person.getEmail());

        person.setEmail("testemail@domain.");
        System.out.println("Invalid email set attempt: " + person.getEmail());

        // Тестирование установки пароля
        System.out.println("\nSetting new passwords:");
        person.setPassword("cQ1%dfa");  // меньше 8 символов
        person.setPassword("cQ1%dfa_"); // валидный пароль
        System.out.println("Valid password set: " + person.getPassword());

        person.setPassword("12345678"); // без заглавной буквы и спец. символа
        System.out.println("Invalid password set attempt: " + person.getPassword());
    }
}
