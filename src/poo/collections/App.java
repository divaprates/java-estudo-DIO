package poo.collections;

import poo.collections.list.CarrinhoDeCompras;
import poo.collections.list.ListaTarefa;

public class App {
    public static void main(String args[]) {
        ListaTarefa tarefas = new ListaTarefa();
        tarefas.adicionarTarefa("Caminhar");
        tarefas.adicionarTarefa("beber água");
        tarefas.adicionarTarefa("ler um livro");
        tarefas.adicionarTarefa("Caminhar");

        System.out.println(tarefas.obterNumeroTotal());
        tarefas.obterDescricoes();
        tarefas.removerTarefa("Caminhar");
        tarefas.obterDescricoes();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã", 10.12, 2);
        carrinho.adicionarItem("copo americano", 2.00, 5);
        carrinho.adicionarItem("maçã", 12.12, 3);

        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("maçã");
        carrinho.exibirItens();
    }
}
