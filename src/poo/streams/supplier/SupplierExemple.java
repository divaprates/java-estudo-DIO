package poo.streams.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String args[]) {
        Supplier<String> saudacoes = () -> "Olá, seja bem vindo ao meu mundo!";

        List<String> lista = Stream.generate(saudacoes)
            .limit(5)
            .toList();
        
        lista.forEach(System.out::println);
    }
}
