package trabalhandoarquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio186 {

    public void exercicio186() {


        String[] novaslinhas = new String[]{"Bom dia", "Boa tarde", "Boa noite"};

        String caminhoArquivo = "/home/jvela/Documentos/Testes_Curso_Java/NovoArquivo";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            for (String linha : novaslinhas) {
                bw.write(linha);
                bw.newLine();

            }

        } catch (
                IOException e) {
            System.out.println("ERRO: " + e.getMessage());
            e.printStackTrace();
        }


    }
}
