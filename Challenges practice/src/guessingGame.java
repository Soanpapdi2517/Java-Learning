import java.sql.SQLOutput;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our number guessing game");
        int numGuess = 7;
        int num;
        do {
            System.out.println("Enter your to guess: ");
            num = input.nextInt();
        } while (num == numGuess);
        System.out.println("Your guessed right number");
    }
}
