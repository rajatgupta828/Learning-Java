package com.rajat.AccessModifiers;

import java.util.ArrayList;

public class Account {

    public  String accountName;
    public  int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " Deposited , new balance is  : " + this.balance);
        }else{
            System.out.println("Could not add tis amount to the account");
        }
    }

    public void withdraw(int amount){
        if(this.balance < amount){
            System.out.println("Can not withdraw this amount, Insufficient Balance..");
        }else{
            this.balance = this.balance - amount;
            System.out.println("Updated Balance : " + this.balance);
        }
    }
}
