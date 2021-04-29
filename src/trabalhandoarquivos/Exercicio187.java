package trabalhandoarquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio187 {

    public void exercicio187() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho da pasta: ");
        String caminho = sc.nextLine();

        File pasta = new File(caminho);

        File[] pastas = pasta.listFiles(File::isDirectory);
        System.out.println("-----------------------PASTAS: ");
        for (File diretorio : pastas) {
            System.out.println(diretorio);

        }

        File[] arquivos = pasta.listFiles(File::isFile);
        System.out.println("------------------------ARQUIVOS: ");
        for (File documento : arquivos) {
            System.out.println(arquivos);

        }

        boolean sucesso = new File(caminho + "/TesteCursoJava").mkdir();
        if (sucesso == true) {
            System.out.println("Pasta criada com sucesso!!! - " + sucesso);
        } else {
            System.out.println("Erro na criação da pasta!!! - " + sucesso);
        }

    }
}
