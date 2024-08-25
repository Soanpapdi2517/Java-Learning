import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to our first calculate your two nums");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your operator in small letters: ");
        String operator = input.next();
        int calculator = switch (operator){
            case "+", " add", "jodo" -> num1 + num2;
            case  "-", "subtract", "minus", "ghatao" -> num1 - num2;
            case "*", "x", "X", "into", "multiply" -> num1 * num2;
            case "/", "divide" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> 0;
        };
        System.out.println("Here is calculation of two nums are: " + calculator);
    }
}
