package ro.fasttrackit.course8homework.bank;

import ro.fasttrackit.course8homework.AccountBank;

public class BtProvide implements AccountBank {
    public void make(String msg){
        System.out.println("" + msg);
    }
    public String deposit(String amount){
        return "Introduceti suma pe care doriti sa o depozitati : ";

    }
    public double withdraw(double amount, double balance) {
        if (amount <= balance) {
        }
        return balance-=amount;
    }
}
