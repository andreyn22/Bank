package main.java.ro.sci.domain;

import java.util.ArrayList;
import java.util.List;

public class Pos {

    List<String> IBANs = new ArrayList<>();

    void addKnownBankAccount(String IBAN) {
        this.IBANs.add(IBAN);
    }

    void pay(Account account, double amount) {
        if (account.balance > amount) {
            account.balance = account.balance - amount;
        } else {
            System.out.println(("Insuficient funds !"));
        }
    }
}
