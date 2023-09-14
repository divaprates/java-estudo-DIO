package poo.abstrato;

public class App {
    
    public static void main(String args[]) {
        Mensagem mensagem = new Orkut();
        Mensagem mensagem2 = new MSN();

        mensagem.enviarMensagem();
        mensagem2.enviarMensagem();

    }

}
