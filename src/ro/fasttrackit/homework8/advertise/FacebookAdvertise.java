package ro.fasttrackit.homework8.advertise;

import ro.fasttrackit.homework8.ServicesAdvertises;

public class FacebookAdvertise implements ServicesAdvertises {
    public void advertise(String msg) {
        System.out.println("Advertise on Facebook" + msg);
    }

    public String getCost() {
        return "free";
    }
}
