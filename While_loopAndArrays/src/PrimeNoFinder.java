import java.util.Scanner;

public class PrimeNoFinder {
    public static void main(String[] args) {
        System.out.println("Welcome to prime number calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourable number: ");
        int num = input.nextInt();
        boolean primeNo = isPrime(num);
        if(primeNo){
            System.out.println("Your number is prime");
        }else {
            System.out.println("Your number is not prime");
        }

    }
    public static boolean isPrime(int x){
        int i = 2;
        while (i< x){
            if (x % i == 0){
                return true;
            }
            i++;
        }
        return false;
    }
}
