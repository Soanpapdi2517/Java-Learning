import java.util.Scanner;

public class BitwiseOpAnd {
    public static void main(String[] args) {
        System.out.println("Welcome to Bitwise operator calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int result = num1 & num2;
        System.out.println(result + " Here is your result");
        int result2 = num1 | num2;
        System.out.println(result2 + " Here is your result");
        int result3 = num1 ^ num2;
        System.out.println(result3+ " Here is your result");
        int result4 =  ~num1;
        System.out.println(result4 + " Your first number's compliment is this");
        int result5 =  ~num2;
        System.out.println(result5 + " Your first number's compliment is this");
        int result6 =  num2<<1;
        System.out.println(result6 + " Your first number's compliment is this");
    }
}
