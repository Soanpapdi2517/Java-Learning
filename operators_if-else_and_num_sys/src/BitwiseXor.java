import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        System.out.println("Welcome to our Bitwise calculator for XOR");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your Second number: ");
        int num2 = input.nextInt();
        int result = num1 ^ num2;
        System.out.println("Your result is here: " + result);
    }
}
