package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(0, "Arroz", 5.50, 300);
        produtos.adicionarProduto(1, "Feijao", 6.34, 12343);
        produtos.adicionarProduto(2, "John cena", 4.50, 165);
        produtos.adicionarProduto(3, "Pindamoinghaba", 0.99, 343);
        produtos.adicionarProduto(4, "Zuckerberg", 1500, 255);
        System.out.println(produtos.exibirPorNome());
        System.out.println(produtos.exibirPorPreco());
    }
    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        setProdutos.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirPorNome(){
        Set<Produto> produtos = new TreeSet<>(setProdutos);
        return produtos;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtos = new TreeSet<>(new ComparatorPorPreco());
        produtos.addAll(setProdutos);
        return produtos;
    }
    
}
