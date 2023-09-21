package poo.collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import poo.collections.map.comparator.ComparatorLivroPorAutor;
import poo.collections.map.comparator.ComparatorLivroPorPreco;
import poo.collections.map.model.Livro;

public class Livraria {
    Map<String, Livro> livraria;

    public Livraria() {
        livraria = new HashMap<>();
    }
    
    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livraria.put(link, livro);
    }

    public void exibirLivors() {
        Map<String, Livro> livroTreeMap = new TreeMap<>(livraria);
        System.out.println(livroTreeMap);
    }
    
    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livraria.remove(chave);
        }
    }
    
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livros = new ArrayList<>(livraria.entrySet());

        Collections.sort(livros, new ComparatorLivroPorPreco());

        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livros) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenados;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livros = new ArrayList<>(livraria.entrySet());

        Collections.sort(livros, new ComparatorLivroPorAutor());

        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livros) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenados;
    }
    
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livros = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            Livro livro = entry.getValue();

            if(livro.getAutor().equalsIgnoreCase(autor)) {
                livros.put(entry.getKey(), livro);
            }
        }
        return livros;
    }
    
    public Map<String, Livro> obterLivroMaisBarato() {
        Map<String, Livro> livrosOrdenados = exibirLivrosOrdenadosPorPreco();
        Livro livroMaisBarato = livrosOrdenados.values().iterator().next();
        Map<String, Livro> livrosResult = new LinkedHashMap();
        
        for (Map.Entry<String, Livro> entry : livrosOrdenados.entrySet()) {
            if(entry.getValue().getPreco() <= livroMaisBarato.getPreco()) {
                livrosResult.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosResult;
    }

    public Map<String, Livro> obterLivroMaisCaro() {
        Map<String, Livro> livrosOrdenados = exibirLivrosOrdenadosPorPreco();
        Livro livroMaisCaro = ultimoLivroPorPreco();
        Map<String, Livro> livrosResult = new LinkedHashMap();
        
        for (Map.Entry<String, Livro> entry : livrosOrdenados.entrySet()) {
            if(entry.getValue().getPreco() >= livroMaisCaro.getPreco()) {
                livrosResult.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosResult;
    }

    private Livro ultimoLivroPorPreco() {
        Map<String, Livro> livrosOrdenados = exibirLivrosOrdenadosPorPreco();
        Livro livro = new Livro();

        for (Map.Entry<String, Livro> entry : livrosOrdenados.entrySet()) {
            livro = entry.getValue();
        }

        return livro;
    }

}
