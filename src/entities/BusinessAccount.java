package entities;

public class BusinessAccount extends Account {

    private Double limiteEmprestimo;
    private Double emprestimoRealizado = 0.0;


    public BusinessAccount() {
        super();
    }

     public BusinessAccount(Integer numero, String dono, Double saldo, Double limiteEmprestimo) {
        super(numero, dono, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getEmprestimoRealizado() {
        return emprestimoRealizado;
    }

     public void emprestimo(double valor){
        if (valor <= limiteEmprestimo) {
            limiteEmprestimo -= valor;
            emprestimoRealizado = valor;
            saldo -= 10.0;
            }else {
            System.out.println("Limite de empréstimo menor que valor solicitado!");
        }
    }

    @Override
    public Double saque(double valor) {
        super.saque(valor);
        saldo -= 2.00;

        return saldo;
    }

    public String infoEmprestimo() {
        return "BusinessAccount{" +
                "limiteEmprestimo=" + limiteEmprestimo +"\n"+
                "emprestimoRealizado=" + emprestimoRealizado +
                '}';
    }
}
