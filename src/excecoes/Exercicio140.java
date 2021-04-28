package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio140 {

    public void exerciocio140() {

        metodo1();

        System.out.println("Fim do programa");
    }

    public static void metodo1() {
        System.out.println("+++++++++++Metodo1-START++++++++++");
        metodo2();
        System.out.println("+++++++++++Metodo1-END++++++++++++");


    }

    public static void metodo2() {
        System.out.println("+++++++++++Metodo2-START++++++++++");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        }finally {
            sc.close();
            System.out.println("Execução FINALLY");
        }
        System.out.println("+++++++++++Metodo2-END++++++++++");

    }
}
