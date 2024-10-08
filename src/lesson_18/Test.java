package lesson_18;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 07-10-2024
*/

/*

 */
public class Test {
    // non-static поле класса - принадлежит конкретным объектам класса
    int x;

    // static поле класса - принадлежит самому классу и общее для всех объектов
    static int staticY;

    // Нестатический метод
    public void testNonStatic() {
        // Нестатические методы могут обращаться и к нестатическим, и к статическим полям
        x++; // Увеличиваем не-статическое поле
        staticY++; // Увеличиваем статическое поле
        // Нестатические методы могут вызывать как статические, так и нестатические методы
        testStatic(); // Вызов статического метода
    }

    // Статический метод
    public static void testStatic() {
        // Статические методы видят только статические члены класса
        staticY++; // Увеличиваем значение статического поля
        // x++; // Ошибка! Статический метод не может обращаться к нестатическим полям напрямую
        // Статические методы могут вызывать только другие статические методы
        System.out.println("testStatic called");
    }

    // Главный метод программы (статический) Имеет доступ только к статическому контенту.
    public static void main(String[] args) {
        // testNonStatic(); // Ошибка компиляции: не могу вызывать нестатический метод без объекта

        testStatic(); // Вызов статического метода напрямую через класс
        Test.testStatic(); // Вызов статического метода через класс

        // Чтобы вызвать нестатический метод или поле, нужно создать объект класса
        Test test = new Test(); // Создаем объект класса
        test.testNonStatic(); // Вызов нестатического метода через объект

        // Выводим значения полей
        System.out.println("Static field staticY: " + staticY); // Статическое поле
        System.out.println("Non-static field x: " + test.x); // Нестатическое поле (через объект test)
    }
}
