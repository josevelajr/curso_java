package herancapolimorfismo;

import entities.Account;
import entities.BusinessAccount;

import java.util.Scanner;

public class Exercicio125 {

    public void exercicio125() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Conta Normal");
        Account contaCorrente = new Account(1, "Vela", 1000.00);
        System.out.println(contaCorrente.toString());

        System.out.println("-----------------------------------------------------");

        System.out.println("Conta Empresa");
        BusinessAccount contaEmpresa = new BusinessAccount(1, "Bia", 2000.00, 1500.00);
        System.out.println(contaEmpresa.toString() + "\n" + contaEmpresa.infoEmprestimo());

        contaEmpresa.emprestimo(200.00);
        System.out.println(contaEmpresa.toString() + "\n" + contaEmpresa.infoEmprestimo());


        sc.close();


    }
}
