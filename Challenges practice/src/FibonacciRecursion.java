import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to get your fibonacci numbers of your entered position");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position in fibonacci series: ");
        int position = input.nextInt();
        for(int i = 0; i <= position; i++){
            System.out.print(fibonaccinums(i) + " ");
        }
    }
    public static int fibonaccinums(int position){
        if (position == 0){
            return 0;
        }if (position == 1){
            return 1;
        }
        return fibonaccinums(position-1) + fibonaccinums(position - 2);
    }
}
