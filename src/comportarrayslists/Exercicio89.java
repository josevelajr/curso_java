package comportarrayslists;

import java.util.Scanner;

public class Exercicio89 {

    public void exercicio89(){

        int pessoas;
        double alturaMedia = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de pessoas: ");
        pessoas = sc.nextInt();
        double[] altura = new double[pessoas];
        System.out.println();

        for (int i = 0; i < pessoas; i++){
            System.out.println("Digite a altura da pessoa "+(i+1));
            altura[i] = sc.nextDouble();
        }

        for (int i = 0; i < pessoas; i++){
            System.out.println("A altura da pessoa "+(i+1)+" é "+altura[i]+"m");
            alturaMedia += altura[i]/pessoas;
        }

        System.out.printf("A media da altura é %.2fm",alturaMedia);


        sc.close();
    }

}
