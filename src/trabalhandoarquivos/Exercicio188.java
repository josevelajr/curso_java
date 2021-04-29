package trabalhandoarquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio188 {

    public void exercicio188() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        File arquivo = new File(caminho);

        System.out.println("Nome do arquivo: " + arquivo.getName());
        System.out.println("Nome do caminho: " + arquivo.getParent());
        System.out.println("Nome do caminho completo: " + arquivo.getPath());


        sc.close();

    }
}
