public class LargestElementInArray {
    public static void main(String[] args) {

        int[] numbers = {34, 78, 12, 90, 1001, 89, 23, 45};


        int largest = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }


        System.out.println("The largest element in the array is: " + largest);
    }
}
