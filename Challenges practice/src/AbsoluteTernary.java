import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to get absolute value  of your number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int yourNum = input.nextInt();
        int absoluteValue = yourNum < 0 ? -yourNum : yourNum;
        System.out.println("here your number is absolute now: " + absoluteValue );

    }
}
