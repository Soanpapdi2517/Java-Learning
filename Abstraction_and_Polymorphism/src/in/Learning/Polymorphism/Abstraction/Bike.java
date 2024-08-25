package in.Learning.Polymorphism.Abstraction;

public class Bike extends Vehicle{
    public void transported() {
        System.out.println("It is Transported...");
    }
    @Override
    protected void makesSoundOnStart() {
        System.out.println("\nMy bike has been started...");
    }

    public Bike(int noOTires) {
        super(noOTires);
    }
}
