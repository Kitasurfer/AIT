import java.util.Scanner;
public class lesson_05_011 {
    public static void main(String[] args) {
// Создаем объект Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Пример работы со строками и объектом Scanner
        // Чтение строки от пользователя
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine(); // Чтение строки

        // Приветствие
        System.out.println("Приветствую Вас " + name + "!");

        // Возраст
        System.out.print("Введите ваш возраст ");
        int age = scanner.nextInt(); // Чтение целого числа
        scanner.nextLine(); // Очищаем остаток строки

        System.out.println("Ваш возраст " + age);

        // Чтение числа с плавающей запятой (зарплата)
        System.out.print("Введите Вашу зарплату ");
        double salary = scanner.nextDouble(); // Чтение числа с запятой

        System.out.println("Ваша зарплата: " + salary);

        // Пример работы с методом String
        // Длинна имени
        System.out.println("Длинна Вашего имени: " + name.length());

        // Преобразование имени в верхний и нижний регистр
        System.out.println("Ваше имя в верхнем регистре: " + name.toUpperCase());
        System.out.println("Ваше имя в нижнем регистре: " + name.toLowerCase());

        // Получение подстроки
        if (name.length() >3) {
            System.out.println("Первые три буквы Вашего имени: " + name.substring(0, 3));
        } else {
            System.out.println("Ваше имя слижком короткое для подстроки из трех символов.");
        }

        // Заменяем в имени одну букву на другую
        System.out.println("Имя после замены буквы 'a' на 'o': " + name.replace('a', 'o'));

        // Закрываем сканер если не нужен
        scanner.close();









    }
}
