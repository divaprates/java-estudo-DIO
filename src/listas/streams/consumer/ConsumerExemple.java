package listas.streams.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExemple {
    public static void main(String args[]) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 5, 4, 7, 8);

        System.out.println("Consumer");
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        });

        System.out.println(" ");
    }

}
