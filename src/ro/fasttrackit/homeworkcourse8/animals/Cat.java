package ro.fasttrackit.homeworkcourse8.animals;

import ro.fasttrackit.homeworkcourse8.AnimalsBehavior;

public class Cat implements AnimalsBehavior {
    public void set(String msg) {
        System.out.println(" " + msg);
    }

    public String walk() {
        return "cat-walking";
    }

    public String talk() {
        return "miau";
    }

    public String eat() {
        return "mouses";
    }
}


