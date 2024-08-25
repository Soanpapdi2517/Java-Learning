import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to Know minimum between your 2 numbers\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int minimum = num1 < num2 ? num1 : num2;
        System.out.println("Minimum number between your two number is: " + minimum);
    }
}