import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Welcome to our Fibonacci series calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = input.nextInt();
        System.out.println("Your fibonacci series is here");
        fibonacciSeries(x);
    }
    public static void fibonacciSeries(int x){
        if (x < 0){
            System.out.print("0 ");
        } if ( x == 0) {
            System.out.println("1 ");
        }
        int first = 0, second = 1;
        while(first + second <= x) {
            int sum = first + second;
            System.out.print(sum + " ");
             first = second;
             second = sum;
        }
    }
}
