package in.getterSetter;

public class CarTest {
    public static void main(String[] args) {
        Car newCar = new Car("Huraccan", "Italy", "Yellow", 5000, 600000, 5);
        System.out.println(newCar.getCarName());
        System.out.println(newCar.getColor());
        System.out.println(newCar.getCountryOfOrigin());
        newCar.setColor("red");
        System.out.println(newCar.getColor());
    }
}
