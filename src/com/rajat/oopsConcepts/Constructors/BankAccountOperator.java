package com.rajat.oopsConcepts.Constructors;

public class BankAccountOperator {

    public static void main(String[] args) {
        BankAccount rajat = new BankAccount(1234,1000.00,"Rajat Gupta",
                "rajatgupta828@gmail.com", "9940610027");

        BankAccount pankaj = new BankAccount(1512,10000.00,"Pankaj Dabas",
                "pankajdabas2626@gmail.com","9540750260");

        rajat.depositFunds(10000.00);
        System.out.println("Money deposited in Rajat's account, Updated balance : " + rajat.getBalance());

        pankaj.withDrawFunds(12000.00);
    }
}
