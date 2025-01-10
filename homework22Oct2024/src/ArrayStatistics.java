public class ArrayStatistics {

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public static double findAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 9, 1, 10, 6};

        int max = findMax(numbers);
        int min = findMin(numbers);
        double average = findAverage(numbers);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}

