package poo.collections;

import poo.collections.list.CarrinhoDeCompras;
import poo.collections.list.ListaTarefa;
import poo.collections.list.OrdenacaoPessoa;
import poo.collections.list.SomaNumeros;

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

        //  Soma números
        System.out.println("\nSoma Números");

        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(38);
        numeros.adicionarNumero(64);
        numeros.adicionarNumero(89);

        System.out.println("Total: " + numeros.calcularSoma());
        System.out.println("Maior número: " + numeros.encontrarMaiorNumero());
        System.out.println("Maior número: " + numeros.encontrarMenorNumero());
        System.out.println("Maior número: " + numeros.exibirNumeros());


        //  Ordenar Pessoas
        System.out.println("\nOrdenar Pessoas");
        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
        pessoas.adicionarPessoas("Lua", 12, 1.78);
        pessoas.adicionarPessoas("Sol", 18, 1.60);
        pessoas.adicionarPessoas("Flor", 17, 1.64);
        pessoas.adicionarPessoas("Mar", 15, 1.70);

        pessoas.exibirPessoas();
        System.out.println("\nOrdenar por altura");
        System.out.println(pessoas.ordenarPorAltura());
        System.out.println("\nOrdenar por idade");
        System.out.println(pessoas.ordernarPorIdade());
    }
}
