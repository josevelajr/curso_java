package entities;

public class FuncTerceiros extends Funcionario{

    private Double despesaAdicional;

    public FuncTerceiros() {

    }

    public FuncTerceiros(String nome, Integer hora, Double valorPorHora) {
        super(nome, hora, valorPorHora);
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    private Double setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
        return despesaAdicional;
    }

    @Override
    public Double pagamento(Integer hora, Double valorPorHora) {
        Double pagamento = hora * valorPorHora;
        despesaAdicional = (pagamento * 2) + (pagamento * 10/100);
        return setDespesaAdicional(despesaAdicional);
    }

}
