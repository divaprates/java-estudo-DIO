package estados;

public class App {
    public static void main(String args[]) throws Exception {
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println("Sigla: " + estado.getSigla() + " | Estado: " + estado.getNome());
        }

        EstadosBrasileiros meuEstado = EstadosBrasileiros.MINAS_GERAIS;
        System.out.println("\nEu moro em: " + meuEstado.getNome() + " - " + meuEstado.getSigla());
    }
}
