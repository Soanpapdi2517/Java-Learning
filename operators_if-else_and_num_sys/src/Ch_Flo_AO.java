import java.util.Scanner;

public class Ch_Flo_AO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you first Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second Number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double into = num1 * num2;
        double minus = num1 - num2;
        double div = num1 / num2;
        double mod = num1 % num2;
        System.out.println("addtion of your Numbers: " + sum);
        System.out.println("Multiplication of your Numbers: " + into);
        System.out.println("Subtraction of your Numbers: " + minus);
        System.out.println("Division of your Numbers: " + div);
        System.out.println("After division of your Numbers your remainder is: " + mod);
    }
}
