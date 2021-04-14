package herancapolimorfismo;

import entities.Account;
import entities.SavingsAccount;

public class Exercicio129 {

    public void exercicio129() {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0);
        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.toString());
        System.out.println(y.toString());
    }
}
