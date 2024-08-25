import java.util.Scanner;

public class Chl_RelationOp {
    public static void main(String[] args) {
        System.out.println("Welcome to our comparison of numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println(Name + " is eligible to vote in 2024 elections");
        } else {
            System.out.println(Name + " is below 18 and " + Name + " is not eligible to vote");
        }
    }
}
