package ro.fasttrackit.course8homework;

public interface AccountBank {
    void make(String msg);

    String deposit(String amount);
    double withdraw(double amount, double balance);

}


