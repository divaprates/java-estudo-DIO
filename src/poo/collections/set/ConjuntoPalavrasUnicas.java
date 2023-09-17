package poo.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;
    
    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }
    
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

}
