package estruturascondicionais;

import java.util.Scanner;

public class Exercicio39 {
    public void exercicio39() {


        int diadigitado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o  dia numero relacionado ao dia da semana: ");
        diadigitado = sc.nextInt();
        String diadasemana;

        switch (diadigitado) {
            case 1:
                diadasemana = "Domingo";
                break;
            case 2:
                diadasemana = "Segunda";
                break;
            case 3:
                diadasemana = "Terça";
                break;
            case 4:
                diadasemana = "Quarta";
                break;
            case 5:
                diadasemana = "Quinta";
                break;
            case 6:
                diadasemana = "Sexta";
                break;
            case 7:
                diadasemana = "Sábado";
                break;
            default:
                diadasemana = "não encontrado";
                break;
        }
        System.out.println("Dia da semana digitado: " + diadasemana);
        sc.close();


    }
}
