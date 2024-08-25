import java.util.Scanner;

public class GCDof2Nums {
    public static void main(String[] args) {
        System.out.println("Welcome to greatest common divisior calculator of two numbers\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int greatestCD = GCD(num1, num2);
        System.out.print("GCD of your two numbers is: " + greatestCD);
    } public static int GCD(int x, int y) {
        int gcd = 1;
        int i = 1;
        int least = least(x, y);
        while (i <= least) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
            i++;
        }return gcd;
    }
    public static int least(int a, int b){
        if (a < b){
            return b;
        } else {
            return a;
        }
    }
}
