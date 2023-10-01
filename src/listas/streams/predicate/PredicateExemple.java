package listas.streams.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExemple {
    public static void main(String args[]) {
        List<String> palavras = Arrays.asList("java", "angular", "react", "flutter", "javascript", "c");

        // Predicate<String> listPredicate = p -> p.length() > 5;

        palavras.stream()
            .filter(p -> p.length()<5)
            .forEach(System.out::println);
    }
}
