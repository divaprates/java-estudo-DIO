package poo.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import poo.collections.list.model.Pessoa;
import poo.collections.list.util.ComparatorPorAltura;


public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        pessoas = new ArrayList<>();
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public void exibirPessoas() {
        System.out.println(pessoas);
    }

}
