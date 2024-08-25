import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to know sum till your entered number in fibonacci order\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number till which we calculate fibonacci series: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++){
            System.out.println(fibonacciRecursion(i) + " ");
        }
    }

    public static long fibonacciRecursion(int position){
        System.out.print(".");
        if (position == 1){
            return 0;
        }if (position == 2) {
            return 1;
        }
        return fibonacciRecursion(position - 1) + fibonacciRecursion(position - 2);
    }
}
