package listas.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import listas.collections.set.model.Contato;
import listas.collections.set.util.ComparatorPorNumero;

public class Agenda {
    private Set<Contato> contatos;
    
    public Agenda() {
        contatos = new HashSet<>();
    }

    public Set<Contato> buscar(String nome) {
        Set<Contato> busca = new HashSet<>();
        for (Contato c : contatos) {
            if(c.getNome().startsWith(nome)) {
                busca.add(c);
            }
        }
        return busca;
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public void adicionarContato(String nome, String numero, Integer classi) {
        contatos.add(new Contato(nome, numero, classi));
    }

    public Set<Contato> exibirContatosPorNome() {
        Set<Contato> contatosPorNome = new TreeSet<>(contatos);
        return contatosPorNome;
    }

    public Set<Contato> exibirContatosPorNumero() {
        Set<Contato> contatosPorNumero = new TreeSet<>(new ComparatorPorNumero());
        contatosPorNumero.addAll(contatos);
        return contatosPorNumero;
    }
}
