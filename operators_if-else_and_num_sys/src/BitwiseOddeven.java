import java.util.Scanner;

public class BitwiseOddeven {
    public static void main(String[] args) {
        System.out.println("Welcome to Bitwise odd even calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to know its odd or even: ");
        int num1 = input.nextInt();
        if ((num1 & 1) ==0){
            System.out.println("Your number is even");
        } else {
            System.out.println("your number is odd");
        }
    }
}
