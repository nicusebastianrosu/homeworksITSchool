package lambdaAndStreams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Prg04 {
    public static void main(String[] args) {

        List<String> list = List.of("mere", "pere", "caise");

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                if ("aeiouAEIOU".contains(str)) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        Predicate<String> predicate1 = (String str) -> {
            if ("aeiouAEIOU".contains(str)) {
                return true;
            } else {
                return false;
            }
        };

        // Predicate<String> predicate2 = litera -> "aeiouAEIOU".contains(litera);
        Predicate<String> predicate2 = "aeiouAEIOU"::contains;

        list.stream()
                .flatMap(x -> Stream.of(x.split("")))
                .filter(predicate2)
                //.forEach(x -> System.out.println(x));
                .forEach(System.out::println);
    }
}
