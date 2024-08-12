package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContato("Pedro", 1);
        contatos.adicionarContato("Joao", 6);
        contatos.adicionarContato("Giulia", 2);
        contatos.adicionarContato("Maria", 3);
        contatos.adicionarContato("Joanete", 4);
        contatos.adicionarContato("Gabardo", 6);
        contatos.exibirContatos();
        contatos.atualizarNumero("Pedro", 12);
        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("Joa"));
    }

    public AgendaContatos() {
        this.contatosSet = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatos = new HashSet<>();
        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatos.add(contato);
            }
        }
        return contatos;
    }

    public void atualizarNumero(String nome, int novoNumero){
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                break;
            }
        }
    }
}
