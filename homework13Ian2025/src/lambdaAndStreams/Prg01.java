package lambdaAndStreams;

import java.util.function.Function;

public class Prg01 {
    public static void main(String[] args) {
        Function<Integer, Integer> function = new Function<>() {
            @Override
            public Integer apply(Integer i) {
                return i + 1;
            }
        };

        Function<Integer, Integer> function1 = x -> x + 1;
        System.out.println(function1.apply(2));


    }
}
