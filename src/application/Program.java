package application;

import entities.Account;
import entities.AccountCorrente;
import entities.AccountPoupanca;

public class Program {
    public static void main(String[] args) {
        
        Account accountCorrente = new AccountCorrente("Samuel", 4587, 774.0, "Corrente", 300.00);

        System.out.println(accountCorrente);
        System.out.println();
        accountCorrente.saque(25.0);
        System.out.println(accountCorrente.toString());
        System.out.println();

        Account accountPoupanca = new AccountPoupanca("Diego", 3648, 998.0, "Poupanca");

        System.out.println(accountPoupanca.toString());
        System.out.println();
        accountPoupanca.saque(25.0);
        System.out.println(accountPoupanca.toString());



    }
}
