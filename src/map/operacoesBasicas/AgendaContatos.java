package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public static void main(String[] args) {
        AgendaContatos listaContatos = new AgendaContatos();
        listaContatos.adicionarContato("Pedro", 1);
        listaContatos.adicionarContato("Giulia", 2);
        listaContatos.adicionarContato("Joao", 3);
        listaContatos.exibirContatos();
        System.out.println(listaContatos.pesquisarPorNome("Joao"));
        listaContatos.removerContato("Giulia");
        listaContatos.exibirContatos();
    }

    public void adicionarContato(String nome, Integer numero){
        contatosMap.put(nome, numero);
    }
    public void removerContato(String nome){
        contatosMap.remove(nome);
    }
    public void exibirContatos(){
        System.out.println(contatosMap);
    }
    public Integer pesquisarPorNome(String nome){
        return contatosMap.get(nome);
    }
}
