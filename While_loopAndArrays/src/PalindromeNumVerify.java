import java.util.Scanner;

public class PalindromeNumVerify {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome number checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isPalindrome = palindromeNumbercheck(num);
        if (isPalindrome){
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("your number is not palindrome");
        }
    }
    public static boolean palindromeNumbercheck(int num){
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0){
            int digit = num % 10;
            num /= 10;
            finalNumber = finalNumber * 10 + digit;
        }return finalNumber == numCopy;
    }
}
