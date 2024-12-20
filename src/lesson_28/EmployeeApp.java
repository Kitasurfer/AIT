package lesson_28;/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 21-10-2024
*/

import lists.MyArrayList;
import lists.MyList;

/*

 */
public class EmployeeApp {
    public static void main(String[] args) {

        MyList<Employee> employees = new MyArrayList<>();

        Employee employee = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Иван", "Иванов", "05.12.1990");
        Employee employee2 = new Employee("Иван", "Иванов", "15.01.2001");
        Employee employee3 = new Employee("Иван", "Иванов", "15.01.2001");

        System.out.println(employee == employee1);
        System.out.println("employee2 == employee3: " + (employee2 == employee3));

        System.out.println("employee2.equals(employee3): " + (employee2.equals(employee3)));

        System.out.println("employee1.equals(employee2): " + (employee1.equals(employee2)));

    }
}