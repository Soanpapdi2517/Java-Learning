import java.util.Scanner;

public class EvenOddusingTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to determine your number is odd or even");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number here: ");
        int num = in.nextInt();
        String oddEven = num % 2 == 0 ? "Even" : "odd";
        System.out.println("Your number is " + oddEven);
    }
}
