package homework_43;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 11-11-2024
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Task 3
 * Дан список Person с полями name, age и city. Используйте Stream API для фильтрации людей,
 * которые старше определенного возраста
 * и проживают в определенном городе, а затем соберите их в список.
 * Например, старше 25 лет и проживающие в "Berlin".
 */
public class Task_3 {

    public static void main(String[] args) {
        // Create a list of persons with different Person objects
        List<Person> persons = new ArrayList<>(
                List.of(
                        new Person("Artem", 25, "Berlin"),
                        new Person("Olya", 26, "Berlin"),
                        new Person("Hans", 40, "Dusseldorf"),
                        new Person("Inna", 20, "Berlin"),
                        new Person("Kolya", 50, "Hamburg"),
                        new Person("Dasha", 30, "Paris"),
                        new Person("Igor", 30, "Berlin")
                )
        );

        // Filter the list of people who are older than 25 and live in Berlin
        List<Person> filteredPersons = filterPerson(persons, 24, "Berlin");

        // Print the filtered list of people
        filteredPersons.forEach(System.out::println);
    }



    // Method to filter the list of people by age and city
    private static List<Person> filterPerson(List<Person> persons, int age, String city) {
        return persons.stream()
                // Filter by age and city
                .filter(person -> person.getAge() > age && person.getCity().equalsIgnoreCase(city))
                .toList(); // Collect the filtered results into a list
    }
}
