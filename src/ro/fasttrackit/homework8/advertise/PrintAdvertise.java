package ro.fasttrackit.homework8.advertise;

import ro.fasttrackit.homework8.ServicesAdvertises;

public class PrintAdvertise implements ServicesAdvertises{
        public void advertise(String msg) {
            System.out.println("Advertise on printed " + msg);
        }

        public String getCost(){
            return "free";
    }
}
