package listas.collections.set.util;

import java.util.Comparator;

import listas.collections.set.model.Contato;

public class ComparatorPorNumero implements Comparator<Contato> {

    @Override
    public int compare(Contato c1, Contato c2) {
        return Integer.compare(c1.getClassi(), c2.getClassi());
    }
    
}
