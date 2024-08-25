import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        System.out.println("Welcome to our Bitwise calculator for Not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        int result = ~num1;
        System.out.println("Your result is here: " + result);
    }
}