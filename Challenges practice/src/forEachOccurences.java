import java.util.Scanner;

public class forEachOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to know the occurences in your data(Array)");
        int[] myarray = ArrayUltility.inputArray();
        System.out.print("Enter the number you want to know the occurences in an array: ");
        int searchNum = input.nextInt();
        int occ = 0;
        for (int num : myarray){
            if (num == searchNum){
                occ++;
            }
        } System.out.println("Your entered number occured " + occ + " times");
    }
}
