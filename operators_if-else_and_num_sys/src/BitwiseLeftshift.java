import java.util.Scanner;

public class BitwiseLeftshift {
    public static void main(String[] args) {
        System.out.println("Welcome to our Bitwise calculator for leftshift");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number of 2's: ");
        int n = input.nextInt();
        int result = num1<<n;
        System.out.println("Your result is here: " + result);
    }
}
