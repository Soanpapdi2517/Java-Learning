import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("welcome to check palindrome array:\n");
        int[] checkArray = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(checkArray);
        if (isPalindrome){
            System.out.println("Your array is palindrome");
        } else{
            System.out.println("Your Array is not palindrome");
        }
    }
    public static boolean isPalindrome(int[] checkArray){
        int i = 0;
        while(i < checkArray.length/2){
            if(checkArray[i] != checkArray[(checkArray.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
