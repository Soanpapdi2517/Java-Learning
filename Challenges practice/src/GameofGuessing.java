import java.util.Scanner;

public class GameofGuessing {
    int random;

    public GameofGuessing() {
        random = (int) Math.ceil(Math.random()*100);
    }
    /**
     * @param guessnum
     * @return
     * - Negative please guess higher number
     *  0 - You have guessed right number
     * - positive - please guess smaller number
     * */
    int guess(int guessnum){
        return guessnum - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameofGuessing game = new GameofGuessing();
        System.out.println("Welcome to our guessing game," +
                " Try your luck you have 5 chance");
        int num;
        int guessed;
            do {
                System.out.print("Enter your number to guess our number: ");
                num = input.nextInt();
                guessed = game.guess(num);
                if (guessed == 0) {
                    break;
                } else if (guessed < 0) {
                    System.out.println("You have guessed smaller, please guess little higher");
                }else {
                    System.out.println("You have guessed higher, please guess little smaller");
                }
            }while (guessed != 0);
        System.out.println("You have guessed right number");
    }
}