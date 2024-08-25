import java.util.Scanner;

public class Armsrongnum {
    public static void main(String[] args) {
        System.out.println("Welcome to know your number is armstrong or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean armstrongcheck = isArmstrong(num);
        if (armstrongcheck){
            System.out.println("Your entered number is armstrong number");
        }else {
            System.out.println("Your entered number is not a armstrong number");
        }
    } public static boolean isArmstrong(int x){
        int count = digitcount(x);
        int finalNumber = 0;
        int lastComparingNumber = x;
        while (x > 0){
            int digit = x % 10;
            x = x / 10;
            finalNumber += power(digit, count);
            System.out.println("Your final number is: " + finalNumber);
        }
        return finalNumber == lastComparingNumber;
    }
    public static int digitcount(int y){
        int count = 0;
        while (y > 0){
            y = y/ 10;
            count++;

        }
        System.out.println("counting of your number is: " + count);
        return count;
    }
    public static int power(int x, int y){
        int pow = 1;
        int i = 0;
        while (i < y){
            pow = pow*x;
            i++;
        }
        System.out.println("power of " + x + " is " + pow);
        return pow;
    }
}