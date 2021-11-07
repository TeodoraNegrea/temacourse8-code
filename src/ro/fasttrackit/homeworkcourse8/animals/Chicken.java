package ro.fasttrackit.homeworkcourse8.animals;

import ro.fasttrackit.homeworkcourse8.AnimalsBehavior;

public class Chicken implements AnimalsBehavior {
    public void set(String msg) {
        System.out.println(" " + msg);
    }

    public String walk() {
        return "chicken-walking";
    }

    public String talk() {
        return "piu-piu";
    }

    public String eat() {
        return "corn";
    }
}
