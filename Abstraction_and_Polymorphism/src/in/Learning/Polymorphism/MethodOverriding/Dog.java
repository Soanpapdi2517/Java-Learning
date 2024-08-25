package in.Learning.Polymorphism.MethodOverriding;

public class Dog extends Animal{
    @Override
    public void animalSound() {// This will going to override from its parent will change into this
        System.out.println("Woof Woof...");
        super.animalSound();
    }
}
