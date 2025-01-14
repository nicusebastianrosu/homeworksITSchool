package homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithAnonymousClass {
    public static void main(String[] args) {
        // Step 1: Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);

        System.out.println("Original List: " + numbers);

        // Step 2: Sort the list using an anonymous class for the comparator
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // Ascending order
            }
        });

        // Step 3: Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}

