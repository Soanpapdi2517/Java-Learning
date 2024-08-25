package in.inheritance;

public class Vehicle {
    protected int hasNoofTires; //Protected is default but create exception for child classes who are in other packages

    @Override
    public String toString() {
        return "This is a vehicle first and in starting it has " + hasNoofTires + " Tires";
    }

    public void commute(){
        System.out.printf("I am going from Place A to Place B using %d tires %n", hasNoofTires);
    }
}
