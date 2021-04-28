package excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exerciocio141 {

    public void exerciocio141(){
        File file = new File("/home/jvela/Documentos/Testes_Curso_Java/test");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco finally executado");
        }
    }
}
