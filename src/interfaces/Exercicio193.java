package interfaces;

import entities.Alocacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio193 {

    public void exercicio193() throws ParseException {

        String modeloCarro;
        Date dataInicial;
        Date dataFinal;
        double valorDiario;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o modelo do carro: ");
        modeloCarro = sc.nextLine();
        System.out.printf("Digite a data de entrada(dd/MM/yyyy HH:mm): ");
        dataInicial = sdf.parse(sc.nextLine());
        System.out.printf("Digite a data de saida(dd/MM/yyyy HH:mm): ");
        dataFinal = sdf.parse(sc.nextLine());
        System.out.printf("Digite o valor diario: ");
        valorDiario = sc.nextDouble();

        Alocacao alocacao = new Alocacao(modeloCarro, dataInicial, dataFinal);

        alocacao.calculaValor(valorDiario);


        sc.close();


    }
}
