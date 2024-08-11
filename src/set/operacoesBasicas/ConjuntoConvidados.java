package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Pedro", 0);
        convidados.adicionarConvidado("Giulia", 1);
        convidados.adicionarConvidado("Gabardo", 2);
        convidados.adicionarConvidado("Augusto", 3);
        convidados.adicionarConvidado("Matheus", 4);
        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();
        convidados.removerCandidatoCodigo(3);
        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());
        
    }

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadosSet.add(new Convidado(nome,codigo));
    }
    public void removerCandidatoCodigo(int codigo){
        for (Convidado convidado : convidadosSet) {
            if(convidado.getCodigo() == codigo){
                convidadosSet.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }
}
