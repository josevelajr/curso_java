package entities;

public class ProdutoPrivate {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoPrivate() {
        }

    public ProdutoPrivate(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
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
