package List;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<Tarefa>();
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<Tarefa>();
        for (Tarefa tarefa : listaTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(tarefaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }
    
}
