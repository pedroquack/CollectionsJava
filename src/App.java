import list.basics.ListaTarefas;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();

        listaTarefas.removerTarefa("Tarefa 1");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}
