package listas.streams.function;

import java.util.Arrays;
import java.util.List;

public class FunctionExemple {
    public static void main(String args[]) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 5, 4, 7, 8);

        List<Integer> dobrar = numeros.stream()
            .map(n -> n*2)
            .toList();
        
        dobrar.forEach(System.out::println);
    }
}
