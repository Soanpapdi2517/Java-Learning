import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greetings();
        String name = collectNames();
        int first = number();
        int second = number();
        int Add = first + second;
        System.out.println("addition your number: " + Add);
    }
    public static void greetings(){
        System.out.println("Welcome to our calculator \n");
    }
    public static String collectNames(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name;
        return input.nextLine();
    }
    public static int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num;
        return input.nextInt();
    }
}
