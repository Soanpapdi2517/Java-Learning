import java.util.Scanner;

public class TempConv_chall {
    public static void main(String[] args) {
        System.out.println("This is a Temperature converter from Fahrenheit to Celsius");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit:");
        double f = input.nextDouble();;
        double C = (f - 32)*5/9;
        System.out.println("Temperature in Celsius is: " + C);
    }
}
