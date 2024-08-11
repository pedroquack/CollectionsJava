package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    public static void main(String[] args) {
        OrdenacaoPessoa lista = new OrdenacaoPessoa();
        lista.adicionaPessoa("Pedro", 19, 1.93);
        lista.adicionaPessoa("Giulia", 19, 1.54);
        lista.adicionaPessoa("Matheus", 26, 1.70);
        lista.adicionaPessoa("João", 15, 1.80);
        lista.adicionaPessoa("Marcos", 13, 2.40);
        lista.adicionaPessoa("Pedro", 13, 1.93);

        System.out.println(lista.ordenarPorAltura());
        System.out.println(lista.ordenarPorIdade());
    }

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }

    public void adicionaPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<Pessoa>(listaPessoas);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPorAltura = new ArrayList<Pessoa>(listaPessoas);
        Collections.sort(listaPorAltura, new ComparatorPorAltura());
        return listaPorAltura;
    }


}
