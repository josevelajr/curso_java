package comportarrayslists;

import java.util.Scanner;

public class Exercicio99 {

    public void exercicio99() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite as posições da matriz: " + i + "-" + j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);

        }

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Qtde de numeros negativos: " + count);


        sc.close();
    }
}
