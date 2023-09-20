package poo.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

// removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
// exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
// pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
// obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
// exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
}
