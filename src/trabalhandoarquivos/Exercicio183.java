package trabalhandoarquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio183 {

    public void exercicio183() {
        File arquivo = new File("/home/jvela/Documentos/Testes_Curso_Java/teste");
        Scanner sc = null;
        System.out.println(arquivo.exists());


        try {
            sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
