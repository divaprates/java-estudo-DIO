package poo;

public abstract class Pessoa {
    private String nome;
    private String telefone;

    public abstract void ligar();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
