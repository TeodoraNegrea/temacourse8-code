package ro.fasttrackit.homeworkcourse8.animals;

import ro.fasttrackit.homeworkcourse8.AnimalsBehavior;

public class Mouse implements AnimalsBehavior {
    public void set(String msg) {
        System.out.println(" " + msg);
    }

    public String walk() {
        return "mouse-walking";
    }

    public String talk() {
        return "chit-chit";
    }

    public String eat() {
        return "cheese";
    }
}

