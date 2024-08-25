package in.soanpapdi;

import in.getterSetter.Car;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("Maruti", "India", "Black", 5000,365996,2);
        System.out.println(myCar.getColor());
        System.out.println(myCar.getCarName());
    }
}
