import java.util.Scanner;

public class Factorial_Challenge {
    public static void main(String[] args) {
        System.out.println("Factorial calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for which you want to know factorial: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Here is your factorial of given number: " + fact);
    }
    public static long factorial(int num){
        long fact = 1;
        int i = 1;
        while (i<=num){
            fact *= i;
            i++;
        }return fact;
    }
}
