package in.Learning.Polymorphism.MethodOverriding;

public class Cat extends Animal{
    @Override
    public void animalSound() {// This will going to override from its parent will change into this
        System.out.println("meow.. meow...");
        super.animalSound();
    }
}
