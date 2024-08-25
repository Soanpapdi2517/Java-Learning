public class Car {
    static int noOfCarSold;
    String carName;
    int noofWheels;
    float fuelinlitres;
    int maxspeed;
    int noOfSeats;
    String color;
    float kmofCar;

    static {
        noOfCarSold = 0; //Static is the first thing that a class will call & only be called one time
        System.out.println("I'm in static block"); // ME SIRF EK BAAR CHALEGA
        //  this will run only one time doesn't matter how many times you call the object FOR EX - myCar
        //Priority - STATIC > CODE BLOCK > CONSTRUCTOR
    }
    {
        noOfCarSold++; // code block runs before constructor this means this is the first thing will be done when we call class
        System.out.println("I'm in code block "); // TU BULA TOH ME HAZAR BAAR CHLNE KE LIYE READY HAI
        //This will be run as many times as you call the object
    }
    Car(String color){
        this.color = color;
        maxspeed = 150;
        noOfSeats = 8;
        noofWheels = 4;
        carName = "swift";
        fuelinlitres = 3;
        kmofCar = 2;
    }
    Car(){
        this("Black");
    }

    public Car started(){
        if (fuelinlitres == 0){
            System.out.println("Your Car is not have enough fuel to start");
        }else if (fuelinlitres <= 5){
            System.out.println("Add some fuel in your Car, Your car have fuel under 5 litre");
        }else{
            System.out.println("Your Car has been started brrrr......");
        }return this;
    }
    public void drive(){
        System.out.println("Car is driving...");
        fuelinlitres--;
    }
    public void addfuel(float fuelinlitres){ // before using "this" to make it global i can use this.
        this.fuelinlitres+= fuelinlitres;
        System.out.println("You added fuel of " + fuelinlitres);
    }
    public float getFuelinlitres(){
        return fuelinlitres;
    }
}
