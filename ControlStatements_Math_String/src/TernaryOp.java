import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        System.out.println("Welcome to know the use of Ternary operator");
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter your number first: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int greatestNumber = num1 > num2 ? num1 : num2; // variable name = experssion or what we use inside if ? if true -- Value : if false -- value
        System.out.println(greatestNumber + " is greatest number ");



//        if (num1 > num2) {
//        }else {
//        }
//            System.out.println(greatestNumber + " is greatest number ");


    }
}