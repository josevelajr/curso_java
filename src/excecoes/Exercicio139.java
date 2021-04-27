package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio139 {

    public void exercicio139() {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        }
        System.out.println("Fim do programa");

        sc.close();


    }
}
