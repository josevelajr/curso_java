package services;

import entities.AluguelCarros;

public class ServicoAluguel {
    private Double precoPorHora;
    private Double precoPorDia;
    private TaxasServicosBrasil taxasServicosBrasil;

    public ServicoAluguel() {
    }

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, TaxasServicosBrasil taxasServicosBrasil) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxasServicosBrasil = taxasServicosBrasil;
    }

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public TaxasServicosBrasil getTaxasServicosBrasil() {
        return taxasServicosBrasil;
    }

    public void processamentoFatura(AluguelCarros aluguelCarros){

    }

}
