import java.util.Scanner;

public class Chall_compoundInt {
    public static void main(String[] args) {
        System.out.println("This program is to calculate Compound interest");
        Scanner input = new Scanner(System.in);
        System.out.println("Hi please enter your principle amount: ");
        int pAmount = input.nextInt();
        System.out.print(" now please enter your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("now share your time: ");
        float time = input.nextFloat();
        double compoundI = pAmount* Math.pow((1 + rate/100), time);
        System.out.println("This is your compound interest: " + compoundI);
    }
}
