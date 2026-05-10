package org.example.CollectionsExerciciosDeFixacao.List.CarrinhoDeCompra;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private String variacoes;


    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getVariacoes() {
        return variacoes;
    }

    public void setVariacoes(String variacoes) {
        this.variacoes = variacoes;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras: " +
                "nome= " + nome + '\'' +
                ", quantidade= " + quantidade +
                ", preco= " + preco +
                ", variacoes= " + variacoes + '\'';
    }
}
