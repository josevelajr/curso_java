package entities;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Alocacao {

    private String modeloCarro;
    private Date dataInicial;
    private Date dataFinal;


    public Alocacao() {

    }

    public Alocacao(String modeloCarro, Date dataInicial, Date dataFinal) {
        this.modeloCarro = modeloCarro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }


    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }


    public void calculaValor(Double valorDiario) {
        Double valorTotal = 100.00;
        long horasAlocacao = dataFinal.getTime() - dataInicial.getTime();
        Double horas = Double.valueOf(TimeUnit.HOURS.convert(horasAlocacao, TimeUnit.MILLISECONDS));
        System.out.println("Tempo total de alocação: " + horas + " horas");
        if (horas > 12.0) {
            valorTotal = horas * valorDiario;
        }
        System.out.println("O valor total sem imposto é de: " + valorTotal);

        if (valorTotal <= 100.00) {
            valorTotal += valorTotal * 0.2;
        } else {
            valorTotal = valorTotal * 0.15;
        }
        System.out.println("O valor total com imposto é de: " + valorTotal);

    }


    public Double calculaImposto() {

        return null;
    }


    @Override
    public String toString() {
        return "Alocacao{" +
                "modeloCarro='" + modeloCarro + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }
}
