import java.util.Scanner;

public class OccurencesUsingForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to know the occurences of your entered number in an array\n");
        int [] myArray = ArrayUtility.inputarray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to search in an array: ");
        int searchNum = input.nextInt();
        int occ = 0;
        for (int num: myArray){
            if (searchNum == num){
                occ++;
            }
        }
        System.out.println("Your entered number occured " + occ + " times in an array");
    }
}
