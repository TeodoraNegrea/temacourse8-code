package ro.fasttrackit.course8homework;

import ro.fasttrackit.course8homework.bank.BrdProvide;
import ro.fasttrackit.course8homework.bank.BtProvide;
import ro.fasttrackit.course8homework.bank.IngProvide;

public class MainProvide {
    public static void main(String[] args) {
        AccountBank ingProvide= new IngProvide();
        AccountBank btProvide= new BtProvide();
        AccountBank brdProvide= new BrdProvide();

        Person person = new Person(ingProvide);
        Person person1 = new Person(btProvide);
        Person person2 = new Person(brdProvide);

        person.makeAccountBank("");
        person1.makeAccountBank("");
        person2.makeAccountBank("");





    }
}
