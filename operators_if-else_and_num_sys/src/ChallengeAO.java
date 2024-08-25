import java.util.Scanner;

public class ChallengeAO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first Number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second Number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int into = num1 * num2;
        int minus = num1 - num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("addtion of your Numbers: " + sum);
        System.out.println("Multiplication of your Numbers: " + into);
        System.out.println("Subtraction of your Numbers: " + minus);
        System.out.println("Division of your Numbers: " + div);
        System.out.println("After division of your Numbers your remainder is: " + mod);
    }
}
