import java.util.Scanner;

public class Challen_AoT {
    public static void main(String[] args) {
        System.out.println("Welcome this program is for Area of Triangle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height of your Triangle in cms: ");
        double height = input.nextDouble();
        System.out.println("Enter base of your Triangle in cms: ");
        double base = input.nextDouble();
        double AoT = 0.5*height*base;
        System.out.println("Here is your area of Triangle in cm sq.: " + AoT);
    }
}
