package in.soanpapdi;

import in.resnuWorld.Car;

public class AccessModifier2 {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.carName = "ferrai";
        newCar.countryofOrigin = "India";
        newCar.colour = "Red";
        System.out.println(newCar);
    }
//    in.resnuWorld.Default def;
}
