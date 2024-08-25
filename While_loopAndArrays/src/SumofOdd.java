import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to odd number calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last number till your want to add odd numbers: ");
        int num = input.nextInt();
        int sum = oddNumCalculator(num);
        System.out.println(num + "till the number you entered sum is: " + sum);
    }
    public static int oddNumCalculator(int num){
        int sum = 0;
        int i = 1;
        while (i<= num) {
            sum += i;
            i += 2;
        }return sum;
    }
}
