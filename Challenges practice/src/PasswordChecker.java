import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to set your password here: \n");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter your password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for providing password: " + password);
    }
    public static boolean isValidPassword(String password){
        return password.length() > 7;
    }
}
