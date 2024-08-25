import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        System.out.println("Welcome to String Manipulation");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = input.nextLine();
        System.out.print("Enter your second name: ");
        String lastname = input.nextLine();
        String fullname = firstname.concat(" ").concat(lastname);
        System.out.println(fullname.toUpperCase());
    }
}
