public class MinMaxFinder {
    // Method to find the minimum value in an array
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method to find the maximum value in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test input array
        int[] numbers = {3, 5, 7, 2, 8, -1000, 4, 10, 1000};

        // Find minimum and maximum values
        int minValue = findMin(numbers);
        int maxValue = findMax(numbers);

        // Print the results
        System.out.println("The minimum value in the array is: " + minValue);
        System.out.println("The maximum value in the array is: " + maxValue);
    }
}
