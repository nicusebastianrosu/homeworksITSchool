public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 6, 8, 10};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
