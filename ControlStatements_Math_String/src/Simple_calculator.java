import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Our simple calculator \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter your operation: ");
        String operator = input.next();
        double calculate = simple_Calculator(operator, num1, num2);
        System.out.println("Your number after calculation is : " + calculate);
    }
    public static double simple_Calculator(String operator, double num1, double num2){
        return switch (operator){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            case "%" -> num1 % num2;
            case "**" -> Math.pow(num1, num2);
            default -> 0;
        };
    }
}
