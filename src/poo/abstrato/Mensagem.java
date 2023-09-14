package poo.abstrato;

public abstract class Mensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarMensagem() {
        System.out.println("Validando envio de mensagem");
    }
}
