package lesson_27;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 18-10-2024
*/

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (isEmailValid(email)) {
            this.email = email;
        }
    }


    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */
    private boolean isEmailValid(String email) {

        int index = email.indexOf('@');

        // Должна присутствовать @ и только одна
        int count = email.length() - email.replace("@", "").length();
        if (count != 1) {
            return false;
        }
        // Точка после собаки
        int indexLast = email.lastIndexOf('.');
        if (index > email.length() - 1) {
            return false;
        }

        // После последней точки есть 2 или более символов
        if (indexLast < email.length() - 2) {
            return false;
        }

        // Алфавит, цифры, '-', '_', '.', '@'
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String alphabet = "abcABC";
        String digit = "0123456789";
        String symbols = "-_.@";
        if (!email.matches(emailRegex)) {
            return false;
        }

        // До собаки должен быть хотя бы 1 символ
        if (index < 1) {
            return false;
        }

        // Первый символ - должна быть буква
        if (!Character.isLetter(email.charAt(0))) {
            return false;
        }
        return true;
    }


   /* private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // Полезные методы класса Character
        // Возвращает true если символ буква
        Character.isAlphabetic('c');
        // Возвращает true если символ цифра
        Character.isDigit('1');
        Character.isLetter('3');
        Character.isLetterOrDigit('-');



        return true;
    }*/


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(isPasswordValid(password)){
            this.password = password;
        }
    }

    private boolean isPasswordValid(String password) {

        password.matches("^{8,}$");

        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */
