package poo.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<Integer> exibirNumeros() {
        return numeros;
    }
}
