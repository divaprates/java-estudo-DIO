package poo.abstracts;

public class Orkut extends Mensagem{

    @Override
    public void enviarMensagem() {
        validarMensagem();
        System.out.println("Mensagem enviada pelo Orkut");
    }

    @Override
    public void receberMensagem() {
        validarMensagem();
        System.out.println("Mensagem recebida pelo Orkut");
    }
    
}
