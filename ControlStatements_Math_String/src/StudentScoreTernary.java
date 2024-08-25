import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to Grade calculator on student's score \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your student's number: ");
        int marks = input.nextInt();
        String category = marks > 80? "High" : (marks > 50 ? "Moderate" : "Low") ;
        System.out.println("Your grade category according to marks is: " + category);

    }
}
