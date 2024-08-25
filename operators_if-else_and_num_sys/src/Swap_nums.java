import java.sql.SQLOutput;
import java.util.Scanner;

public class Swap_nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number A:");
        int a = input.nextInt();
        System.out.print("enter your number B:");
        int b = input.nextInt();
        int c = b;
        b = a;
        a = c;
        System.out.print("here your number got swapped... \n\nnew number 1 is: " + a + "\nnew number 2 is: " + b);
    }
}
