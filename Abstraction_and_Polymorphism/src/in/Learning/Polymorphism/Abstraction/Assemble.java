package in.Learning.Polymorphism.Abstraction;

public interface Assemble{
    void assembled();
    default void vehicleReaching(){
        System.out.println("Your ordered vehicle is reaching for selling in Car showroom");
    }

    static void vehicleOrdered(){// if we create a static method in interface it will come with it's interface class name
        // for example in this  case i can call by using Assemble.vehicleOrdered();
        System.out.println("Your car have been ordered");
    }

}
