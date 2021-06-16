package entities;

import java.util.Locale;

public class Produto2 {

    private String nome;
    private Double valor;

    public Produto2() {

    }


    public Produto2(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public static String staticUpperCaseName(Produto2 p){
        return p.getNome().toUpperCase(Locale.ROOT);
    }

    public String nonUpperCaseName(){
        return nome.toUpperCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return "Produto2{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
