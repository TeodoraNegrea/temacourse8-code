package ro.fasttrackit.homeworkcourse8.animals;

import ro.fasttrackit.homeworkcourse8.AnimalsBehavior;

public class Dog implements AnimalsBehavior {
    public void set(String msg) {
        System.out.println(" " + msg);
    }

    public String walk() {
        return "dog-walking";
    }

    public String talk() {
        return "ham-ham";
    }

    public String eat() {
        return "meat";
    }
}

