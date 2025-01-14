package lambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample02 {
    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "Nicu are mere",
                "Nicu nu are pere",
                "si mananca gem de prune."
        );

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println("List of words: " + words);
    }
}
