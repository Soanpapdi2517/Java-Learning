package in.getterSetter;

public class Car {
    private String carName;
    private String countryOfOrigin;
    private String color;
    private int distanceTravelled;
    private long costOfpurchase;
    private double fuelLevel;

    public Car(String carName, String countryOfOrigin, String color, int distanceTravelled, long costOfpurchase, double fuelLevel) {
        this.carName = carName;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.distanceTravelled = distanceTravelled;
        this.costOfpurchase = costOfpurchase;
        this.fuelLevel = fuelLevel;
    }

    public String getColor() {
        return color;
    }

     void setColor(String color) {
        if (color.equals("red")){
            System.out.println("Ye nahi hai dusra rang bata");
        }else {
             this.color = color;
        }
    }

     public String getCarName() {
        return carName;
    }

     public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
