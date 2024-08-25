package in.Learning.PolymorphismExtraLearning;

public class vehicleTest {
    public static void main(String[] args) {
//        Vehicle vahak = new Vehicle();
        Car car = new Car();
        bike b  = new bike();
        Vehicle b2 = new bike(); // Upcasting // Interface can be use as Parent in upcasting
        Vehicle v = new Car(); // Upcasting // Interface can be use as Parent in upcasting
//        it sees that child is parent or parent's for example Car is a vehicle
        vehicleonly(b);
        vehicleonly(car);
        vehicleonly(b2); // Interface can be use as Parent in upcasting
        vehicleonly(v); // Interface can be use as Parent in upcasting
//        vehicleonly(vahak);
    }
    //downcasting is only allowed in functions when programmmer is very sure that there is only child class that we are targetting
    private static void vehicleonly(Vehicle veh) {//any vehicle which pass in this can run this method for example car,
        // bike
//        Car c2  = (Car) veh; // We can use downcasting when we surely know that the parameter object we passed is  exactly for that object only
////        veh.onOfdoors; ---> In This Car can use Vehicle objects but vehicle cannot use Car objects
//        c2.start();
//        ((Car) veh).noOfdoors();
        veh.start();
        if (veh  instanceof Car){
            System.out.println("it is");
        }
    }
    // Interface can become Parent or reference in as argument of any method
    // Interface can be use as Parent in upcasting
}
