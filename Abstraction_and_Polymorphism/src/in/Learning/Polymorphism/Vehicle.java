package in.Learning.Polymorphism;

public class Vehicle {
    private int noOfTires;
    private final boolean isSteering;
    private int seatNumber;

    public Vehicle(int noOfTires, int seatNumber, boolean isSteering) {
        this.noOfTires = noOfTires;
        this.seatNumber =seatNumber;
        this.isSteering = isSteering;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void start(){
        System.out.println("Vehicle is starting...");
    }
}
