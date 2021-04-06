package estruturascondicionais;

import java.util.Scanner;

public class Exercicio41 {
    public void exercicio41(){

        int valor = 110;
        int desconto;
        Scanner sc = new Scanner(System.in);

        if (valor <= 100){
            desconto = valor - 10;
            System.out.println("Desconto realizado");
        }else {
            desconto = 0;
        }
        System.out.println(desconto);
    }
}
