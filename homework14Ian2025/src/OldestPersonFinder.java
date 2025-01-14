package homework07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestPersonFinder {
    public static void main(String[] args) {
        // Create a list of persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 45));
        persons.add(new Person("Charlie", 40));
        persons.add(new Person("Diana", 50));

        // Find the oldest person using max()
        Optional<Person> oldestPerson = persons.stream()
                .max(Comparator.comparingInt(Person::getAge));

        Optional<Person> youngestPerson = persons.stream()
                .min(Comparator.comparingInt(Person::getAge));

        // Output the result
        oldestPerson.ifPresent(person ->
                System.out.println("The oldest person is: " + person));

        youngestPerson.ifPresent(person -> System.out.println("The youngest person is: " + person));
    }
}