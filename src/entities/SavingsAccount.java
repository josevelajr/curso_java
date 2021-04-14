package entities;

public final class SavingsAccount extends Account {

    private Double taxaJuros;

    public SavingsAccount() {
        super();

    }

    public SavingsAccount(Integer numero, String dono, Double saldo) {
        super(numero, dono, saldo);

    }

    public Double getTaxaJuros() {

        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {

        this.taxaJuros = taxaJuros;
    }

    public final void atualizaSaldo() {
        Double calculoJuros = saldo * taxaJuros / 100;
        saldo += calculoJuros;
    }


    @Override
    public Double saque(double valor) {
        this.saldo -= valor;

        return saldo;
    }


}
