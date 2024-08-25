import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        // for now we are using constant number --- after math topic we will be able to learn random number formation
        System.out.println("Welcome to number guessing game\n");
        Scanner input = new Scanner(System.in);
        int mainNum = 7;
        int num;
        do {
            System.out.print("Enter your number to guess: ");
            num =  input.nextInt();
        }while (num != mainNum);
        System.out.println("Your guessed the right number");
    }
}
