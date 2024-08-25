import javax.swing.text.Style;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ch_AreaOfQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me about your all sides i will give you perimeter of your sides");
        System.out.print("Enter your first side: ");
        double sideA = input.nextDouble();
        System.out.print("Enter your second side: ");
        double sideB = input.nextDouble();
        System.out.print("Enter your Third side: ");
        double sideC = input.nextDouble();
        System.out.print("Enter your Fourth side: ");
        double sideD = input.nextDouble();
        System.out.println("Here your perimeter of all sides are: " +(sideA + sideB + sideC + sideD) + " cms");
    }
}
