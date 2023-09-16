package poo.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        this.criarTarefa(tarefa);
    }

    protected void criarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        if(!this.tarefas.isEmpty()){
            for (Tarefa t : this.tarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasRemover.add(t);
                }
            }
            this.tarefas.removeAll(tarefasRemover);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public int obterNumeroTotal() {
        return tarefas.size();
    }

    public void obterDescricoes() {
        System.out.println(this.tarefas);
    }
}
