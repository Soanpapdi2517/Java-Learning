import java.util.Scanner;

public class Simpleinterest_chall {
    public static void main(String[] args) {
        System.out.println("This is our Simple Interest calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Hi please enter your principle amount: ");
        double pAmount = input.nextDouble();
        System.out.print(" now please enter your rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("now share your time: ");
        double time = input.nextDouble();
        double simpleI = (pAmount*rate*time)/100;
        System.out.println("Here is your simple interest of your shared amount: " +simpleI);
    }
}
