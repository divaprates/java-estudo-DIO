package poo.streams.binaryOperator;

import java.util.Arrays;
import java.util.List;


public class BinaryOperatorExemple {
    public static void main (String args[]) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 6, 3, 3, 7, 8);

        int result = numeros.stream()
            .reduce(0, Integer::sum);

        System.out.println("Result: " + result);
    }
}
