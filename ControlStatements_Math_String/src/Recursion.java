import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial generator using Recursion...");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of your entered number is: " + fact);
    }
    public static long factorial(int factnum){
        System.out.println("Function called for " + factnum);
        if (factnum ==1){ // baseline or where your recursion should end----very important
            return 1;
        }
        return factnum * factorial(factnum - 1); // always make your problem smaller by smaller by every function calling
    }
    public static long factorialIterative(int factnum){
        long fact = 1;
        for (int i = 1; i <= factnum; i++){
            fact = fact * i;
            System.out.println(fact + "*" + i);
        }
        return fact;
    }
}
