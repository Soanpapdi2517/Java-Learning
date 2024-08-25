import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to know your word is palindrome or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word to check: ");
        String word = input.next();
        System.out.println("Your entered word is " + (isPalindrome(word) ? "Palindrome" : "Not palindrome"));
    }
    public static boolean isPalindrome(String word){
        if (word.length() <= 1){
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)){
            return false;
        }
        String newWord = word.substring(1, word.length() - 1);
        return isPalindrome(newWord);
    }
}
