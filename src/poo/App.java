package poo;

public class App {
    public static void main(String args[]) {
        Juridica p1 = new Juridica();
        p1.setNome("Sol");
        System.out.println(p1.getNome());
        p1.ligar();

        Fisica p2 = new Fisica();
        p2.setNome("Lua");
        System.out.println(p2.getNome());
        p2.ligar();

    }
}
