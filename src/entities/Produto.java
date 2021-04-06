package entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

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
