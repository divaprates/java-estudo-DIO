package Testes;

import java.util.HashMap;
import java.util.Map;

public class Troco {

    public static Map<Double, Integer> calcularTroco(double valorCompra, double valorPago) {
        double troco = valorPago - valorCompra;
        
        double[] valoresNotasMoedas = {100, 50, 10, 5, 1, 0.50, 0.10, 0.05, 0.01};
        Map<Double, Integer> trocoMap = new HashMap<>();
        
        for (double valor : valoresNotasMoedas) {
            int quantidade = (int) (troco / valor);
            if (quantidade > 0) {
                trocoMap.put(valor, quantidade);
                troco -= quantidade * valor;
            }
        }
        
        return trocoMap;
    }
    
    public static void main(String[] args) {
        double valorCompra = 78.25;
        double valorPago = 100.0;
        Map<Double, Integer> troco = calcularTroco(valorCompra, valorPago);
        
        System.out.println("Troco:");
        for (Map.Entry<Double, Integer> entry : troco.entrySet()) {
            System.out.println(entry.getValue() + " nota(s)/moeda(s) de " + entry.getKey());
        }
    }
}
