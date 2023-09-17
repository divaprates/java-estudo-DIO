package poo.collections.set;

import java.util.HashSet;
import java.util.Set;

import poo.collections.set.model.Contato;

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

    public void adicionarContato(String nome, String numero) {
        contatos.add(new Contato(nome, numero));
    }
}
