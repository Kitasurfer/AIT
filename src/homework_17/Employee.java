package homework_17;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 06-10-2024
*/

/*
Task 0
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата см Employee_1.java
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
 */


public class Employee {

    // Создаем класс Employee и создаем в нем поля, поля класса (Инкапсулированы) скрываем.
    private String name;
    private int age;
    private long salary;

    // Конструктор
    public Employee(String name, int age, long salary) {
        this.name = name; //Переменными ссылаемся на текущий объект
        this.age = age; //Переменными ссылаемся на текущий объект
        this.salary = salary; //Переменными ссылаемся на текущий объект
    }

    public String getName() {
        return name; // Геттер для поля name, возвращает значение name
    }

    public void setName(String name) {
        this.name = name; // Сеттер для поля name, устанавливает значение для поля name
    }

    public int getAge() {
        return age; // Геттер для поля age, возвращает значение поля age.
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age; // Сеттер для поля age, проверяет возраст больше ноля затем устанавливает
            // значение проверка на корректность возраста
        }
    }
    // Геттер для зарплаты
    public long getSalary() {
        return salary; // Геттер для поля Salary, возвращает значение для поля Salary
    }

    public void setSalary(long salary) { // Сеттер для поля Salary проверяет зарплату, что она больше 0, и устанавливает
        // значение
        if (salary > 0 && salary <= Long.MAX_VALUE) {
            this.salary = salary; // Проверка на корректность зарплату
        } else {
            System.out.println("Ошибка: некорректная зарплата.");
        }
    }

    // Выводим инфо о работнике
    public void info() {
        System.out.printf("Employee: %s, Age: %d, Salary: %d%n", name, age, salary);
    }
}

