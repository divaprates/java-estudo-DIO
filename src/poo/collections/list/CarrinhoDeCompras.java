package poo.collections.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        if(!itens.isEmpty()) {
            for (Item i : itens) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    itensRemover.add(i);
                }
            }
            itens.removeAll(itensRemover);
        } else {
            System.out.println("O carrinho está vazio");
        }
    }

    public Integer calcularValorTotal() {
        return itens.size();
    }

    public void exibirItens() {
        System.out.println(itens);
    }
}
