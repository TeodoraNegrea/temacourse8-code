package ro.fasttrackit.homeworkcourse8;

public class Animal {
    private AnimalsBehavior animalsBehavior;

    public Animal(AnimalsBehavior animalsBehavior){
        this.animalsBehavior = animalsBehavior;
    }
    public void setAnimalsBehavior(String msg){
        animalsBehavior.set(" " + msg);
        System.out.println("This animal have : " + animalsBehavior.walk());
        System.out.println("This animal is doing : " + animalsBehavior.talk());
        System.out.println("This animal is eating : " + animalsBehavior.eat());
    }

}
