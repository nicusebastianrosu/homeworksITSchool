package homework03;

public class StringCombinerExample {
    public static void main(String[] args) {
        // Lambda expression to concatenate two strings with a space in between
        StringCombiner combiner = (s1, s2) -> s1 + " " + s2;

        // Test the lambda expression
        String result = combiner.combine("Hello", "World");

        // Output the result
        System.out.println(result);  // Output: Hello World
    }
}