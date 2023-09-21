package teste;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String args[]) {

        Map<String, String> result = new HashMap<>();
        result.put("teste1", "q");
        result.put("teste1", "w");
        result.put("teste2", "e");
        result.put("teste2", "t");
        result.put("teste3", "r");

        String chave = "Teste1";

        System.out.println(result);
        System.out.println(result.get(chave));

    }
}
