import java.util.Scanner;

public class ExitonExit {
    public static void main(String[] args) {
        System.out.println("welcome to receive commands\n");
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter your command: ");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("exit"))
                break;
        }
        System.out.println("You have successfully exited");
    }
}
