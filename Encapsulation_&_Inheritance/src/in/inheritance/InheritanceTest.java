package in.inheritance;

import in.soanpapdi.Motorcycle;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        TwoWheeler two = new TwoWheeler();
        vehicle.commute();
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.toString());
        System.out.println(vehicle.getClass());
        two.commute();
        two.balance();

        Motorcycle motor = new Motorcycle();
        motor.commute();
        motor.balance();
        motor.start();

    }
}
