package estruturascondicionais;

import java.util.Scanner;

public class Exercicio40 {

    public void exercicio40(){
        double preco;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço: ");
        preco = sc.nextDouble();
        System.out.println();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;

        System.out.println("O valor com desconto é de " + desconto);

        sc.close();
    }

}
