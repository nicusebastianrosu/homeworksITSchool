package homework01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        Consumer<String> printConsumer = s -> System.out.println(s);

        list.forEach(printConsumer);
    }
}
