package in.Learning.Polymorphism.Abstraction;

public class Car extends Vehicle{
    private int noOfDoors;
    public void transported() {
        System.out.println("It is Transported...");
    }

    public Car(int noOTires, int noOfDoors) {
        super(noOTires);
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    protected void makesSoundOnStart() {
        System.out.println("\nMY Car Has been started...");
    }
}
