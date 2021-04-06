package estruturascondicionais;

import java.util.Scanner;

public class Exercicio38 {
    public void exercicio38(){

        int qtdeminutos;
        double planobasico = 100.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de minutos utilizado: ");
        qtdeminutos = sc.nextInt();

        if (qtdeminutos > 100){
            planobasico += (qtdeminutos - planobasico) * 2;
            System.out.printf("O valor a ser pago é de R$ %.2f%n",planobasico);
        }else {
            System.out.printf("O valor a ser pago é de R$ %.2f%n", planobasico);
        }
        sc.close();
    }
}
