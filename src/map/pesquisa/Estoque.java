package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Long,Produto> estoqueMap;

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(1l, "Arroz", 15, 10);
        estoque.adicionarProduto(2l, "Yorgute", 9.5, 23);
        estoque.adicionarProduto(3l, "Dorito", 8, 12);
        estoque.adicionarProduto(4l, "Vinho", 1000, 1);
        estoque.exibirProdutos();
        System.out.println(estoque.valorTotal());
        System.out.println(estoque.obterProdutoMaisCaro());
    }

    public Estoque() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double valorTotal(){
        double total = 0;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                total += p.getQuantidade() * p.getPreco();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maior = 0;
        for (Produto p : estoqueMap.values()) {
            if(p.getPreco() > maior){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }
}
