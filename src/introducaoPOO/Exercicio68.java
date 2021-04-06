package introducaoPOO;

import entities.Produto;

import java.util.Scanner;

public class Exercicio68 {

    public void exercicio68() {

        Scanner sc = new Scanner(System.in);

        Produto objproduto = new Produto();
        System.out.println("Entre com os dados do produto: ");
        System.out.println("Nome: ");
        objproduto.nome = sc.nextLine();
        System.out.println("Entre com o preço do produto: ");
        objproduto.preco = sc.nextDouble();
        System.out.println("Entre com o quantidade do produto: ");
        objproduto.quantidade = sc.nextInt();

        System.out.println(objproduto);

        System.out.println("O produto " + objproduto.nome + " com o preço " + objproduto.preco + " possui a quantidade de " + objproduto.quantidade + " itens.");


    }

}
