package poo;

public class Juridica extends Pessoa {
    private String CNPJ;

    @Override
    public void ligar() {
        System.out.println("ligando...");
    }
}
