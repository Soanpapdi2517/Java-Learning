public class Driver {
    String NameofDriver;
    String dateoflicense;
    int age;
    public boolean isAllowedToDrive(){    // here we can se we can use static declaration in instances
        return this.age >= minimumageforDriving;
    }

    static int minimumageforDriving = 18;
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addfuel(8);
//        myCar.started();
//        myCar.drive();
//        this.drive();
        Car swift = new Car("red");
        Car thar = new Car();
//        swift.addfuel(6);
        swift.started().drive();
        System.out.println(swift.getFuelinlitres());
        // To call the instances like name of driver firstly i have to initializie and declare the object
//        Driver mydriver =  new Driver();
//        mydriver.NameofDriver = "Sukesh"; // here to call firstly i had to declare the object
//        System.out.println(minimumageforDriving()); // we are to directly able call as it is static
        System.out.println(swift.color);
    }
}
