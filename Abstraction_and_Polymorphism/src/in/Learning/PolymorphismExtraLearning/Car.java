package in.Learning.PolymorphismExtraLearning;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is Starting of Vehicle interface");
    }

    int noOfdoors(){
        return 5;
    }
}

