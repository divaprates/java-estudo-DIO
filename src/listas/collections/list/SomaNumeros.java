package listas.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public Integer calcularSoma() {
        return numeros.stream().mapToInt(Integer::intValue).sum();
    }

    public Integer encontrarMaiorNumero() {
        Optional<Integer> optional = numeros.stream().max(Integer::compare);
        Integer maior = 0;

        if (optional.isPresent()) maior=optional.get();

        return maior;
    }

    public Integer encontrarMenorNumero() {
        Optional<Integer> optional = numeros.stream().min(Integer::compare);
        Integer menor = 0;

        if(optional.isPresent()) menor=optional.get();

        return menor;
    }

    public void ordenarAscendente() {
        numeros.stream().sorted();
    }

    public void ordenarDescendente() {
        Collections.sort(numeros, Collections.reverseOrder());
    }
    public String exibirNumeros() {
        return numeros.stream()
            .map(Object::toString)
            .collect(Collectors.joining(", "));
    }
}
