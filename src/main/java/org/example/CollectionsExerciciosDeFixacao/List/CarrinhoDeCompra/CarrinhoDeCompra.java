package org.example.CollectionsExerciciosDeFixacao.List.CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    protected List<String> produtos = new ArrayList<>();


    public void adicionarProduto(String nome){
        produtos.add(String.valueOf(new Produto(nome)));
    }

    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.contains(nome));
    }
        public void exibirProdutos() {
            System.out.println("Produtos no carrinho:");
            for (String produto : produtos) {
                System.out.println(produto);
            }
        }

        public int quatidadeProdutos(){
        return produtos.size();
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarProduto("Caneta");
        carrinho.adicionarProduto("Caderno");
        carrinho.adicionarProduto("Lápis");
        carrinho.exibirProdutos();
        System.out.println("A quantidade de produtos no carrinho é: "+carrinho.quatidadeProdutos());


        carrinho.removerProduto("Caderno");
        carrinho.removerProduto("Lápis");
        System.out.println("A quantidade de produtos no carrinho é: "+carrinho.quatidadeProdutos());





    }
}
