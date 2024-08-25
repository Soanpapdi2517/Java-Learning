import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name:");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " in our world of learning ");
        System.out.print("Enter your number 1:");
        int num1 = input.nextInt();
        System.out.print("Enter your number 2:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int subtract = num1 - num2;
        int into = num1 * num2;
        int div = num1 / num2;
        System.out.print("addition of both numbers are " + sum + "\nsubtraction of both numbers are " + subtract +"\nmultiplication of both numbers are " + into + "\nDivision of both numbers are " + div);

    }
}
