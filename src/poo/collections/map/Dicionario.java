package poo.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> lista;
    
    public Dicionario() {
        lista = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String definicao) {
        lista.put(palavra, definicao);
    }
    
    public void removerPalavra(String palavra) {
        if(!lista.isEmpty()) {
            lista.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio");
        }
    }
    
    public void exibirPalavras() {
        if(!lista.isEmpty()) {
            System.out.println(lista);
        } else {
            System.out.println("O dicionário está vazio");
        }
    }
    
    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;
        if(!lista.isEmpty()) {
            definicao = lista.get(palavra);
            if(definicao.isEmpty()) {
                throw new IllegalArgumentException("Palavra não encontrada");
            }
        }else {
            throw new IllegalArgumentException("A dicionário está vazio");
        }

        return definicao;
    }
}
