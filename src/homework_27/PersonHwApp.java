package homework_27;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 20-10-2024
*/

public class PersonHwApp {
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
