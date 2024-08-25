import java.util.Scanner;

public class Odd_even_challenge {
    public static void main(String[] args) {
        System.out.println("Welcome this is odd or even number determiner");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        if ((num%2)==0) {
            System.out.println(num + " This number is even");
        } else if ((num%2)!=0) {
            System.out.println(num + " This number you enter is odd");
        }
    }
}
