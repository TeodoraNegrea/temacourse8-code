package ro.fasttrackit.homeworkcourse8.animals;

import ro.fasttrackit.homeworkcourse8.AnimalsBehavior;

public class Duck implements AnimalsBehavior {
    public void set(String msg) {
        System.out.println(" " + msg);
    }

    public String walk() {
        return "duck-walking";
    }

    public String talk() {
        return "mac-mac";
    }

    public String eat() {
        return "maize";
    }
}
