package poo.Generica;

public class App {
    public static void main(String args[]) {
        Caixa<String> box1 = new Caixa<>(String.class);
        Caixa<Integer> box2 = new Caixa<>(Integer.class);
        Caixa<Boolean> box3 = new Caixa<>(Boolean.class);

        box1.setItem("melancia");
        box2.setItem(12);
        box3.setItem(true);

        System.out.println("Caixa: " + box1.getTipo() + " | item: " + box1.getItem());
        System.out.println("Caixa: " + box2.getTipo() + " | item: " + box2.getItem());
        System.out.println("Caixa: " + box3.getTipo() + " | item: " + box3.getItem());
    }
}
