package lesson_38.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // 1. Sorting with Comparable (by age)
        Collections.sort(people);
        System.out.println("Sorted by age (using Comparable): " + people);

        // 2. Comparator example (sort by name)
        Comparator<Person> nameComparator = new Comparator<>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Collections.sort(people, nameComparator);
        System.out.println("Sorted by name (using Comparator): " + people);

        // 3. Using Lambda with Comparator to sort by name
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted by name (using Lambda): " + people);

        // 4. Anonymous class example (Runnable)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class example.");
            }
        };
        new Thread(runnable).start();

        // 5. Functional Interface example with custom Greeting interface
        Greeting greeting = (name) -> System.out.println("Hello, " + name);
        greeting.sayHello("John");

        // 6. Lambda with Predicate, Consumer, Function
        Predicate<Person> isAdult = p -> p.getAge() >= 18;
        Consumer<Person> greeter = p -> System.out.println("Hello, " + p.getName());
        Function<Person, String> getName = Person::getName;

        // Using Predicate to filter adults
        List<Person> adults = people.stream().filter(isAdult).collect(Collectors.toList());
        System.out.println("Adults: " + adults);

        // Using Consumer to greet each person
        System.out.println("Greeting everyone:");
        people.forEach(greeter);

        // Using Function to extract names
        List<String> names = people.stream().map(getName).collect(Collectors.toList());
        System.out.println("Names: " + names);
    }
}
