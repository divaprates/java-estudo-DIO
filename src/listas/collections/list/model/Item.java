package listas.collections.list.model;

public class Item {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Item() {}

    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos get para o campo "nome"
    public String getNome() {
        return nome;
    }

    // Métodos set para o campo "nome"
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get para o campo "preco"
    public Double getPreco() {
        return preco;
    }

    // Métodos set para o campo "preco"
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Métodos get para o campo "quantidade"
    public Integer getQuantidade() {
        return quantidade;
    }

    // Métodos set para o campo "quantidade"
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return nome + " : " + preco + " : " + quantidade;
    }
}
