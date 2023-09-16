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

    public void criarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>(null);
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(tarefa);
            }
        }
        this.tarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotal() {
        return tarefas.size();
    }

    public void obterDescricoes() {
        System.out.println(this.tarefas);
    }
}
