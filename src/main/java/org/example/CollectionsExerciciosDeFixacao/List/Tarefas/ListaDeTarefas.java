package org.example.CollectionsExerciciosDeFixacao.List.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> tarefaList;

    public ListaDeTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public String obterDescricoesTarefas(){
        return tarefaList.toString();
    }

    public static void main(String[] args) {
        ListaDeTarefas listaTarefa = new ListaDeTarefas();

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefas("Tarefa 1");
        listaTarefa.adicionarTarefas("Tarefa 1");
        listaTarefa.adicionarTarefas("Tarefa 2");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println(listaTarefa.obterDescricoesTarefas());
    }
}
