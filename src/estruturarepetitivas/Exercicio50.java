package estruturarepetitivas;

import java.util.Scanner;

public class Exercicio50 {

    public void exercicio50() {
        int qtde;
        int numeros;
        int soma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem somados: ");
        qtde = sc.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite o numero para a posição " + i + ":");
            numeros = sc.nextInt();
            soma = soma + numeros;
        }

        System.out.println("A soma total dos numeros digitados são: " + soma);
    }
}
