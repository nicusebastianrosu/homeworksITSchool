package homework02;

public class CalculatorExample {

    public static void main(String[] args) {
        // Addition
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.calculate(5, 3));

        // Subtraction
        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.calculate(5, 3));

        // Multiplication
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.calculate(5, 3));

        // Division
        Calculator divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };
        System.out.println("Division: " + divide.calculate(5, 3));
    }
}
