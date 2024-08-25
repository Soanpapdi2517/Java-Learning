import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to check your string is palindrome or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word or name to check it: ");
        String str = input.next();
        System.out.println("Your string is " +
                (isPalindrome(str) ? "Palindrome"
                                   : "Not palindrome"));
    }
    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        } if (str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        String newString = str.substring(1, str.length() - 1);
        return isPalindrome(newString);
    }
}
