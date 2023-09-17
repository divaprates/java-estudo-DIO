package poo.collections.list.util;

import java.util.Comparator;

import poo.collections.list.model.Pessoa;

public class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}