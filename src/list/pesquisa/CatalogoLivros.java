package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    public void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2014);
        catalogo.adicionarLivro("Livro 3", "Autor 1", 2017);
        catalogo.adicionarLivro("Livro 8", "Autor 2", 2011);
        catalogo.adicionarLivro("Livro 5", "Autor 5", 2013);
        catalogo.adicionarLivro("Livro 1", "Autor 5", 2024);
        catalogo.adicionarLivro("Livro 23", "Autor 1", 1999);

        System.out.println(catalogo.pesquisarIntervalo(2013, 2017));
        System.out.println("------------------------");
        System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
        System.out.println("------------------------");
        System.out.println(catalogo.pesquisarPorTitulo("Livro 23"));
    }

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        listaLivros.add(new Livro(titulo,autor,ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<Livro>();
        if(!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(livro);
                }
            } 
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarIntervalo(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalo = new ArrayList<Livro>();
        if(!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                    livroPorIntervalo.add(livro);
                }
            }
        }
        return livroPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro livro : listaLivros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
}
