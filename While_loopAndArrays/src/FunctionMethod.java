import java.util.Scanner;

public class FunctionMethod {
    public static void main(String[] args) {
        rightpatternstar();
            }
            public static void rightpatternstar(){
                int rows = 0;
                while (rows < 69){
                    System.out.print("*");
                    int i = 0;
                    while (i < rows){
                        System.out.print(" *");
                        i++;
                    } System.out.println();
                    rows++;
                }
            }

}
            /*
{
        System.out.println("Welcome to our function calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number you want to calculate: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your Second number you want to calculate: ");
        double num2 = input.nextDouble();
        System.out.print("Enter your operator: ");
        String op = input.nextLine();
        if (op=="+" || op=="Add"){
            double addtion = num1 + num2;
            System.out.println("Your addtion is done \n" + addtion);
        } else if (op=="-" || op =="Minus") {
            if (num2>num1){
                double subtract = num2 - num1;
                System.out.println("Your subtraction is done \n" + subtract);
            }else {
                double subtract2 = num1 - num2;
                System.out.println("Your subtraction is done \n" + subtract2);
            }
        } else if (op=="*" || op=="Multiply") {
            double multiply = num2 * num1;
            System.out.println("Your subtraction is done \n" + multiply);
        } else if (op=="/" || op =="Divide") {
            if (num2>num1){
                double Division = num2 / num1;
                System.out.println("Your subtraction is done \n" + Division);
            }else {
                double Division2 = num1 / num2;
                System.out.println("Your subtraction is done \n" + Division2);
            }
 */