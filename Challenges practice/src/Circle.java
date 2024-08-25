import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getarea(){
        return Math.round(Math.PI*Math.pow(radius,2));
    }
    public double getcircumference(){
        return Math.round(2* Math.PI*radius);
    }
    @Override
    public String toString() {
        return "Circle props: Radius " + radius + ", circumference of entered radius: " + getarea() +
                "Area of the circle is: "+ getcircumference();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to circle learning\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your radius in mm: ");
        double radius = input.nextDouble();
        Circle areaAndCircum = new Circle(radius);
        System.out.println(areaAndCircum);
    }
}
