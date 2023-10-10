package poo.abstracts;

public class MSN extends Mensagem {

    @Override
    public void enviarMensagem() {
        validarMensagem();
        System.out.println("Mensagem enviada pelo MSN");
    }

    @Override
    public void receberMensagem() {
        validarMensagem();
        System.out.println("Mensagem recebida pelo MSN");
    }
    
}
