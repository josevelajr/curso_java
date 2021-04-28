import entities.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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