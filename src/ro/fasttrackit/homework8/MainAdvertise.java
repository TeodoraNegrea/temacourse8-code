package ro.fasttrackit.homework8;

import ro.fasttrackit.homework8.advertise.EmailAdvertise;
import ro.fasttrackit.homework8.advertise.FacebookAdvertise;
import ro.fasttrackit.homework8.advertise.PrintAdvertise;

public class MainAdvertise {
    public static void main(String[] args) {

        ServicesAdvertises facebookAdvertise = new FacebookAdvertise();
        ServicesAdvertises emailAdvertise = new EmailAdvertise();
        ServicesAdvertises printAdvertise = new PrintAdvertise();
        Company company = new Company(facebookAdvertise);
        Company company1 = new Company(emailAdvertise);
        Company company2 = new Company(printAdvertise);

        company.advertiseMessage(" Just come in our team!");
        company1.advertiseMessage("Just come in our team!");
        company2.advertiseMessage("Just come in our team!");
    }
}
