package trabalhandoarquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio184 {

    public void exerciocio184() {
        String caminhoArquivo = "/home/jvela/Documentos/Testes_Curso_Java/teste";

        FileReader fr = null;

        BufferedReader br = null;

        try {

            fr = new FileReader(caminhoArquivo);
            br = new BufferedReader(fr);

            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
