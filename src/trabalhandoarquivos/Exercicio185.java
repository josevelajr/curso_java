package trabalhandoarquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio185 {

    public void exercicio185() {
        String caminhoArquivo = "/home/jvela/Documentos/Testes_Curso_Java/teste";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
