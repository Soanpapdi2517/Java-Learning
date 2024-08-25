import java.util.Scanner;

public class factorialUsingFor {
    public static void main(String[] args) {
        System.out.println("Welcome to know the factorial of your number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of your entered number is: " + fact);
    }
    public static long factorial(int factnum){
        long fact = 1;
        for (int i = 1; i <= factnum; i++){
            fact = fact * i;
            System.out.println(fact + "*" + i);
        }
        return fact;
    }
}
