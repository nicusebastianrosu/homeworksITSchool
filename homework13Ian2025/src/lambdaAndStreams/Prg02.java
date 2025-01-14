package lambdaAndStreams;

import java.util.function.BiFunction;

public class Prg02 {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s1, String s2) {
                return s1.length() + s2.length();
            }
        };

        BiFunction<String, String, Integer> biFunction1 = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction1.apply("nicu", "rosu"));

    }
}
