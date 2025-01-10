public class MaxFinder {

    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int max = findMax(num1, num2);
        System.out.println("The maximum number is: " + max);
    }
}
