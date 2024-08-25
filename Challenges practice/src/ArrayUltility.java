import java.util.Scanner;

public class ArrayUltility {
    public static int [] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = input.nextInt();
        int [] myarray = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter your number at " + (i+1) + " place: ");
            myarray[i] = input.nextInt();
        }
        return myarray;

    }
}
