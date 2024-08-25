import java.lang.management.MemoryManagerMXBean;
import java.util.Scanner;

public class Min_2_nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to know the minimum of your two numbers");
        System.out.print("Enter your number first: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter your number second: ");
        int num2 = input.nextInt();
        Min_2_nums ternary = new Min_2_nums();
        int min = ternary.min(num1, num2);
        System.out.println(min + " is minimum among entered two numbers");
    }
    public int min(int x, int y){
        return x < y ? x : y;
    }
}
