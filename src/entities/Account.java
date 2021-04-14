package entities;

public class Account {

    private Integer numero;
    private String dono;
    protected Double saldo;

    public Account() {

    }

    public Account(Integer numero, String dono, Double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double saque(double valor) {

        System.out.println("Taxa Saque");
        this.saldo -= 5.55;
        this.saldo -= valor;


        return saldo;
    }

    public Double deposito(double valor) {
        this.saldo += valor;

        return saldo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numero=" + numero +
                ", dono='" + dono + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
