package listas.collections.map.model;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro() {

    }
    
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo:" + titulo +
                ", autor:" + autor +
                ", preco:" + preco +
                "}\n";
    }
}
