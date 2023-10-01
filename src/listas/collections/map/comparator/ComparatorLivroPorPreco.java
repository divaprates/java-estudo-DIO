package listas.collections.map.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import listas.collections.map.model.Livro;

public class ComparatorLivroPorPreco implements Comparator<Map.Entry<String,Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }
    
}
