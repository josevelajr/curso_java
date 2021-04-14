package herancapolimorfismo;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Scanner;

public class Exercicio128 {

    public void exercicio129() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Conta Poupança");

        SavingsAccount contaPoupanca = new SavingsAccount(1, "Vela", 5000.00);
        System.out.println(contaPoupanca.toString());

        System.out.println("-------------------AtualizaSaldo----------------");
        contaPoupanca.setTaxaJuros(10.0);
        contaPoupanca.atualizaSaldo();
        System.out.println(contaPoupanca.toString());


        System.out.println("------------------UPCASTING-------------------");
        //UPCASTING
        Account conta1 = new BusinessAccount(1, "Vela", 1200.00, 500.00);
        System.out.println(conta1.toString());

        System.out.println("----------------DOWNCASTING-------------------");
        //DOWNCASTING
        BusinessAccount conta2 = (BusinessAccount) conta1;
        conta2.emprestimo(100.00);
        System.out.println(conta2.toString());


        if (conta1 instanceof BusinessAccount) {
            System.out.println("Foi!");
        }


        Account conta3 = new Account(1000, "Vela", 10000.00);
        SavingsAccount conta4 = new SavingsAccount(1001, "Bia", 5000.00);

        System.out.println("Saque conta3");
        conta3.saque(100.00);
        System.out.println(conta3.toString());


        System.out.println("Saque conta4");
        conta4.saque(100.00);
        System.out.println(conta4.toString());


        Account conta5 = new BusinessAccount(1050, "Cris", 2000.00, 1000.00);
        conta5.saque(100.00);
        System.out.println(conta5.toString());


        sc.close();


    }
}
