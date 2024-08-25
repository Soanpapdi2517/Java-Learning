package in.Learning.Polymorphism.Abstraction;
// Multiple interfaces are allowed in Java
public abstract class Vehicle implements Transport, Assemble{
    private int noOTires;
    protected abstract void makesSoundOnStart(); // Abstract Method is used to make compulsory for child classes to define this in their classes
    @Override
    public void assembled() {
        System.out.println("Your Vehicle is assembled");
    }

    public Vehicle(int noOTires) {
        this.noOTires = noOTires;
    }

    public int getNoOTires() {
        return noOTires;
    }

    public void setNoOTires(int noOTires) {
        this.noOTires = noOTires;
    }
    public void commute(){
        System.out.printf("Vehicle is running %d %s" , noOTires , "Tires");
    }
}
