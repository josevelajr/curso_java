package entities;

public class ProdutoComConstrutor {

    public String nome;
    public double preco;
    public int quantidade;

    public ProdutoComConstrutor(){

    }

    public ProdutoComConstrutor(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public ProdutoComConstrutor(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    }

    public double valorTotalemEstoque() {
        return preco * quantidade;
    }
    public void addProdutos(int quantity) {
        this.quantidade += quantity;
    }
    public void removerProdutos(int quantity) {
        this.quantidade -= quantity;
    }
    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                + String.format("%.2f", valorTotalemEstoque());
    }


}
