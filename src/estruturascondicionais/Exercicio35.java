package estruturascondicionais;

import java.util.Scanner;

public class Exercicio35 {
    public void exercicio35(){
        int horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite as horas: ");
        horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia");
        } else if (horas < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
        sc.close();
    }

}
