package in.Learning.Polymorphism.Abstraction;

public class TestVehicle {
    public static void main(String[] args) {
        Car myCar = new Car(4, 4);
        Assemble.vehicleOrdered();
        myCar.vehicleReaching();
        myCar.assembled();
        myCar.transported();
        myCar.makesSoundOnStart();
        myCar.commute();
    }
}
