import java.util.Scanner;

public class Greaternum_challe {
    public static void main(String[] args) {
        System.out.println("welcome to greatest of the number checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = input.nextDouble();
        System.out.print("Enter your second number: ");
        double b = input.nextDouble();
        System.out.print("Enter your third number: ");
        double c = input.nextDouble();
        if (a >= b && b >= c) {
            System.out.println(a + " This is the biggest value in entered intergers " + c + " This is the smallest value of entered interger");
        } else if (b >= c && c >= a) {
            System.out.println(b + " This is the biggest value in entered intergers " + a + " This is the smallest value of entered interger");
        } else if (c >= b && a >= b) {
            System.out.println(c + " This is the biggest value in entered intergers " + b + " This is the smallest value of entered interger");
        }

    }
}