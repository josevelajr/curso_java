package estruturasequencial;

import java.util.Scanner;

public class Exercicio26 {

    public void exercicio26(){

        Scanner sc = new Scanner(System.in);

        String xS;

        xS = sc.next();

        System.out.println("Você digitou a palavra: " + xS);


        int xInt;

        xInt = sc.nextInt();

        System.out.println("Você digitou o número: " + xInt);


        double xDouble;

        xDouble = sc.nextDouble();

        System.out.printf("Você digitou o número decimal: %.2f%n", xDouble);


        char xChar;

        xChar = sc.next().charAt(0);

        System.out.println("Você digitou o caracter: " + xChar);




        sc.close();

    }
}
