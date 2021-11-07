package ro.fasttrackit.homeworkcourse8;

import ro.fasttrackit.homework8.Company;
import ro.fasttrackit.homework8.ServicesAdvertises;
import ro.fasttrackit.homework8.advertise.EmailAdvertise;
import ro.fasttrackit.homework8.advertise.FacebookAdvertise;
import ro.fasttrackit.homework8.advertise.PrintAdvertise;
import ro.fasttrackit.homeworkcourse8.animals.*;

public class MainBehavior {
    public static void main(String[] args) {
        AnimalsBehavior cat = new Cat();
        AnimalsBehavior dog = new Dog();
        AnimalsBehavior mouse = new Mouse();
        AnimalsBehavior chicken = new Chicken();
        AnimalsBehavior duck = new Duck();

        Animal  animal = new Animal(cat);
        Animal  animal1 = new Animal(dog);
        Animal  animal2 = new Animal(mouse);
        Animal  animal3 = new Animal(chicken);
        Animal  animal4 = new Animal(duck);

        animal.setAnimalsBehavior(" ");
        animal1.setAnimalsBehavior(" ");
        animal2.setAnimalsBehavior(" ");
        animal3.setAnimalsBehavior(" ");
        animal4.setAnimalsBehavior(" ");

    }
}
