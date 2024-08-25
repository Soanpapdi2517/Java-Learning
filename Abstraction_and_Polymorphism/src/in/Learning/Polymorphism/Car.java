package in.Learning.Polymorphism;

public class Car extends Vehicle{
    static int noOfCarProduced;
    public int noOfHeadlights(){
        return 5;
    }
    public String typeOfCar(){
        return "sedan";
    }

    public Car() {
        super(4, 5, true);
    }

    {
      noOfCarProduced++;
    }

    public static int getNoOfCarProduced() {
        return noOfCarProduced;
    }

}
