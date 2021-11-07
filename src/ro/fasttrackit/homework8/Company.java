package ro.fasttrackit.homework8;

public class Company {
    private ServicesAdvertises servicesAdvertises;

    public Company(ServicesAdvertises servicesAdvertises){
        this.servicesAdvertises = servicesAdvertises;
    }
    public void advertiseMessage(String msg){
        servicesAdvertises.advertise(" that our services will bring happiness in your life!" + msg);
        System.out.println("Everything is " + servicesAdvertises.getCost());
    }
}
