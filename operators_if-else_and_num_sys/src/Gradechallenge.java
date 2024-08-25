import java.util.Scanner;

public class Gradechallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to grade calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage to calculate your grades: ");
        float grade = input.nextFloat();
        if (grade>100) {
            System.out.println(" Entered invalid percentage");
        } else if (grade>=90) {
            System.out.println("You got A grade percentage");
        } else if (grade>=75) {
            System.out.println("You got B grade percentage");
        } else if (grade>=60) {
            System.out.println("You got C grade percentage");
        } else if (grade>=30) {
            System.out.println("You got D grade percentage");
        } else {
            System.out.println("You got failed");
        }
    }
}
