public class ArrayReversal {
    // Method to reverse an array
    public static int[] reverseArray(int[] inputArray) {
        int[] reversedArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            reversedArray[i] = inputArray[inputArray.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        // Test input array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Reverse the array
        int[] reversedArray = reverseArray(originalArray);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int element : reversedArray) {
            System.out.print(element + " ");
        }
    }
}
