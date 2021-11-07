package ro.fasttrackit.homework8.advertise;

import ro.fasttrackit.homework8.ServicesAdvertises;

public class EmailAdvertise implements ServicesAdvertises {
    public void advertise(String msg) {
        System.out.println("Advertise on E-mail" + msg);
    }

    public String getCost() {
        return "free";
    }

}
