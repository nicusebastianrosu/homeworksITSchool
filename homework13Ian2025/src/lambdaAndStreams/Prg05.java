package lambdaAndStreams;

import java.util.List;
import java.util.function.BiFunction;

public class Prg05 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 4, 2, 3, 1, 3, 5);

        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> biFunction2 = Integer::sum;


        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

}
