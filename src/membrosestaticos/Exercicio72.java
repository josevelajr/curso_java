package membrosestaticos;

import entities.Calculadora;

import java.util.Scanner;

public class Exercicio72 {

    public void exercicio72() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        System.out.println("A circunferência é igual a: " + Calculadora.cincunferencia(raio));
        System.out.println("O volume é igual a: " + Calculadora.volume(raio));


    }
}
