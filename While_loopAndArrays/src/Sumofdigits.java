import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println("welcome to know what will be the sum of digits\n ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.print("sum of entered number is: " + sum);
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num = num / 10;

        } return sum;
    }
}
