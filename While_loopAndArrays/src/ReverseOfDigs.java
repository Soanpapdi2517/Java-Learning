import java.util.Scanner;

public class ReverseOfDigs {
    public static void main(String[] args) {
        System.out.println("Welcome to digit reverser\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number which you want to reverse: ");
        int num = input.nextInt();
        int revDigits = revdigits(num);
        System.out.println("Reverse digit of your number is: " + revDigits);
    }
    public static int revdigits(int x){
        int sum = 0;
        while (x > 0) {
            int digit = x % 10;
            sum = sum*10 + digit;
            x = x / 10;
        }
        return sum;
    }
}
