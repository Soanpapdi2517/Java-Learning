import java.util.Scanner;

public class ForPrime {
    public static void main(String[] args) {
        System.out.println("Welcome to know your number is prime or not\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.println("Your number is prime number");
        }else {
            System.out.println("Your number is not prime number ");
        }
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num ; i++){
            if (num % i != 0){
                return false;
            }
        }
        return true;
    }
}
