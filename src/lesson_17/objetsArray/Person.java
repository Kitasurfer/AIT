package lesson_17.objetsArray;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 02-10-2024
*/

/*

 */
public class Person {
    private String name;
    private int age;
    private String hobby;

    // Конструктор класса
    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String toString() {
        return String.format("Person %s, Age: %d, Hobby: %s", name, age, hobby);

    }

    // Геттер для age
    public int getAge() {
        return age;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Геттер для hobby
    public String getHobby() {
        return hobby;
    }

    // Сеттер для age
    public void setAge(int age) {
        this.age = age;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }

    // Сеттер для hobby
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
