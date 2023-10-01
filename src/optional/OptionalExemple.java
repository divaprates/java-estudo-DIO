package optional;

import java.util.Optional;

public class OptionalExemple {
    public static void main(String args[]) {
        // Suponha que você tenha uma função que pode retornar um valor nulo
        Integer valorPossivelmenteNulo = getValor(); // Pode ser nulo

        // Use Optional para processar o valor, se presente
        Optional<Integer> optionalValor = Optional.ofNullable(valorPossivelmenteNulo);

        // Verifique se o valor está presente e faça algo com ele
        optionalValor.ifPresent(v -> {
            System.out.println("valor existente " + v);
        });

        Integer newValue = optionalValor.orElse(1);
        System.out.println("Valor " + newValue);

        newValue = optionalValor.orElseGet(() -> {
            System.out.println("substituindo valor null");
            return 0;
        });
        System.out.println("Valor " + newValue);

        try {
            Integer mandatoryNumber = optionalValor.orElseThrow(() -> new IllegalArgumentException("Valor obrigatório"));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    // Função que pode retornar um valor nulo
    public static Integer getValor() {
        // Simule um valor nulo
        return null;
    }
    
}
