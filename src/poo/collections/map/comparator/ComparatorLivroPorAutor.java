package poo.collections.map.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import poo.collections.map.model.Livro;

public class ComparatorLivroPorAutor implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getAutor().compareToIgnoreCase(o2.getValue().getAutor());
    }
    
}
