package in.Learning.Polymorphism.MethodOverriding;

public class Human extends Animal{

    @Override
    public void animalSound() {// This will going to override from its parent will change into this

        System.out.println("Yes i know how to talk");
        super.animalSound();
    }
}
