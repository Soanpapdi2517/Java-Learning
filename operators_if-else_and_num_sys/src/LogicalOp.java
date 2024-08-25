import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        System.out.println("Welcome to our ticket discount calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your name first: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("are you female? (true/false)");
        boolean isfemale = input.nextBoolean();
        if (age<=5){
            System.out.println(name + " -You got discount of 75% ");
        } else if (isfemale){
            System.out.println(name + " You got 25% discount");
        } else if (age>=60 && !isfemale) {
            System.out.println(name + "You got 50% discount");
        } else{
            System.out.println("you got no discount");
        }
    }
}
