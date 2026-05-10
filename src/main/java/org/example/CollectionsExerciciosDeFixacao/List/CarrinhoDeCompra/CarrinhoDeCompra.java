package org.example.CollectionsExerciciosDeFixacao.List.CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompra {

    protected List<String> produtos = new ArrayList<>();


    public void adicionarProduto(String nome, int quantidade, double preco, String variacoes) {
        produtos.add(String.valueOf(new Produto(nome,quantidade,preco,variacoes)));
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
        Scanner sc = new Scanner(System.in);
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();


        while(true){
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Exibir produtos");
            System.out.println("4 - Quantidade de produtos");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.next();
                    System.out.println("Digite o nome do quantidade: ");
                    int quantidade = sc.nextInt();
                    System.out.println("Digite o nome do preco: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite o nome do variacoes: ");
                    String variacoes = sc.next();

                    carrinho.adicionarProduto(nome, quantidade, preco, variacoes);

                    System.out.println("Produto adicionado com sucesso!");
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("Digite o nome do produto a ser removido: ");
                    String nomeRemover = sc.next();
                    carrinho.removerProduto(nomeRemover);
                    System.out.println("Produto removido com sucesso!");
                    break;
                case 3:
                    carrinho.exibirProdutos();
                    break;
                case 4:
                    System.out.println("Quantidade de produtos: " + carrinho.quatidadeProdutos());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }




    }
}
