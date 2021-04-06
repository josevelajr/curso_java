package introducaoPOO;

import entities.Triangulo;

import java.util.Scanner;

public class Exercicio65 {

    public void exercicio65(){

        int i;
        double areax, areay;

        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areax = x.areaTriangulo();
        System.out.printf("A area do triangulo de X é igual a: %.2f%n", areax);

        areay = y.areaTriangulo();
        System.out.printf("A area do triangulo de Y é igual a: %.2f%n", areay);

    }
}
