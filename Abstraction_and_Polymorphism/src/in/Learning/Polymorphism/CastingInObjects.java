package in.Learning.Polymorphism;

public class CastingInObjects {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4,5,true);// Normal
        Car c = new Car();
        Bike b = new Bike();
        carTest(c);
//        carTest(v);
//        carTest(b);
//        Vehicle v2 = new Car(4, "Offroading Car");
        // Upcasting Child(Car) to parent(Vehicle) is Allowed
        // * syntax - #Parent class <ref> = new #ChildClass
        // 1) Upcasting Child(Car) to parent(Vehicle) is Allowed.
        // 2) Safe and AutoMatic
        // 3) Access to only SuperClass Methods
        //Car c2 = (Car) new Vehicle(4, 5, false); not allowed or advised as Parent Class(Vehicle) have other subclasses

    }
    private static void carTest(Vehicle veh){
        Car c2 = (Car) veh;
        ((Car) veh).noOfHeadlights();
        // DownCasting is only allowed when you know that parent only have single child
        // or you exactly know the child is being targetted...
//        *Syntax #ChildClass <reference> = (#ChildClass) #ParameterName( which is passed as Parent's name)
//        always try by proogrammer to not use
        c2.typeOfCar();
    }
}
