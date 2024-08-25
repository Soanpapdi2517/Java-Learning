import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Welcome to grade checker of your student\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your student's score: ");
        int studentScore = input.nextInt();
        String score = studentScore > 80 ? "High" : (studentScore > 50 ? "Moderate" : "Low");
        System.out.println("Your student's score is " + score);
    }
}
