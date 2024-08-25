package in.resnuWorld;

public class AccessModifierTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.carName = "Supra Mk2";
        myCar.colour = "Cyan";
        myCar.countryofOrigin = "UAE";
        System.out.println(myCar);
        Car yourCar = new Car("porsche", "yellow", "Italy",
                50000, 125000000, 50);
        System.out.println(yourCar);
        Default def = new Default();
    }
}
