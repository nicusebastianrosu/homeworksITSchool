package lambdaAndStreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Prg06 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 4, 2, 3, 1, 3, 5);

        List<Integer> result = list.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        Comparator<Integer> integerComparator1 = (i1, i2) -> i2.compareTo(i1);


        List<Integer> result1 = list.stream()
                .distinct()
                .sorted(integerComparator1)
                .collect(Collectors.toList());
        System.out.println(result1);
    }
}
