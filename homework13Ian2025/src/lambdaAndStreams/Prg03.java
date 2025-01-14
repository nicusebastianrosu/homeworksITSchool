package lambdaAndStreams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Prg03 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 4, 2, 3, 1, 3, 5);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        Consumer<Integer> consumer1 = i -> System.out.println(i);
        // Consumer<Integer> consumer1 = System.out::println;

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return 2 * x;
            }
        };

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x < 5;
            }
        };
        Predicate<Integer> predicate1 = (Integer x) -> {
            return x < 5;
        };

        list.stream().distinct().map(x -> 2 * x).forEach(consumer1);
        System.out.println("===================================");
        list.stream().distinct().map(function).sorted().filter(predicate1).forEach(consumer1);
        System.out.println("===================================");
        list.stream().distinct().map(function).sorted().filter(x -> x < 5).forEach(consumer1);
    }
}
