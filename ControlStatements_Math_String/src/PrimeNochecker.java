import java.util.Scanner;

public class PrimeNochecker {
    public static void main(String[] args) {
        System.out.println("Welcome to know your prime number or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "prime number" : "not prime number"));

    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }return true;
    }
}
