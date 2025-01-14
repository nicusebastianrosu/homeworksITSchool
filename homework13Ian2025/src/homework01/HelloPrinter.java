package homework01;

import java.util.function.Consumer;

public class HelloPrinter {
    public static void main(String[] args) {
        // Consumer to print strings prefixed with "Hello, "
        Consumer<String> greet = str -> System.out.println("Hello, " + str);

        // Test the consumer with a few names
        greet.accept("Alice");
        greet.accept("Bob");
        greet.accept("Charlie");
    }
}
