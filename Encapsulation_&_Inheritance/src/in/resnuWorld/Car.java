package in.resnuWorld;

public class Car {
    public String carName;
    public String colour;
    public String countryofOrigin;
    private int distancetravelled;
    private long cosOfPurchase;
    private double fuelLevel;

    public Car() {
    }

    public Car(String carName, String colour, String countryofOrigin, int distancetravelled, long cosOfPurchase, double fuelLevel) {
        this.carName = carName;
        this.colour = colour;
        this.countryofOrigin = countryofOrigin;
        this.distancetravelled = distancetravelled;
        this.cosOfPurchase = cosOfPurchase;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carName='").append(carName).append('\'');
        sb.append(", colour='").append(colour).append('\'');
        sb.append(", countryofOrigin='").append(countryofOrigin).append('\'');
        sb.append(", distancetravelled=").append(distancetravelled);
        sb.append(", cosOfPurchase=").append(cosOfPurchase);
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append('}');
        return sb.toString();
    }
}
