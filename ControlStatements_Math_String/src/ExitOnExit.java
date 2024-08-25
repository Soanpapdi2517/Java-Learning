import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        System.out.println("Welcome to receive command");
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter your command in capital: ");
            String command = input.next();
            if(command.equalsIgnoreCase("EXIT" )){ // to compare objects we have to use .equals, string is a object.
                break;
            }
        }
        System.out.println("Your programme successfully exited");
    }
}
