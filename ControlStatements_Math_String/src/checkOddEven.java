import java.util.Scanner;

public class checkOddEven {
    public static void main(String[] args) {
        System.out.println("Welcome to check your number is even or odd");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();


        String oddeven = num % 2 == 0 ? "Num is even" : "Num is odd";
        System.out.println(oddeven);
    }
}
