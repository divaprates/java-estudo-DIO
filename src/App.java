import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Double pi = 3.14;

        System.out.println("Valor de pi: " + pi);
        System.out.println("Hello, World!");

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite o seu nome: ");
            String name = scanner.next();
            
            System.out.println("Digite o seu sobrenome: ");
            String lastName = scanner.next();
            
            System.out.println("Digite sua idade: ");
            int age = scanner.nextInt();
            
            System.out.println("Digite o sua altura: ");
            double height = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Os campos inseridos são inválidos: " + e);
        }

    }
}
