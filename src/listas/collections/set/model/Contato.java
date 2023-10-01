package listas.collections.set.model;

import java.util.Objects;

public class Contato implements Comparable<Contato> {
    private String nome;
    private String numero;
    private Integer classi;

    public Contato(String nome, String numero, Integer classi) {
        this.nome = nome;
        this.numero = numero;
        this.classi = classi;
    }

    public Integer getClassi() {
        return classi;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Contato contato))
            return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
    }

    @Override
    public int compareTo(Contato c) {
        return nome.compareToIgnoreCase(c.getNome());
    }

}
