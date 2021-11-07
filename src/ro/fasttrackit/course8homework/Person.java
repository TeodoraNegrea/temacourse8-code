package ro.fasttrackit.course8homework;

public class Person {
    private AccountBank accountBank;
    private double balance;

    public Person(AccountBank accountBank) {
        this.accountBank = accountBank;
        this.balance = balance;
    }

    public Person(){
        balance = 0;
    }
    public void makeAccountBank(String msg) {
        accountBank.make("If you make an bank account with us you will be able to withdraw money from any bank without commissions!" + msg);
        System.out.println("" + accountBank.deposit(""));
        System.out.println("" + accountBank.withdraw(1000,30000));
    }

}