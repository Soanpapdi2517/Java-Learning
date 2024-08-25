import java.util.Scanner;

public class ArrayUtility {
    public static int [] inputarray() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter size of your array: ");
            int size = input.nextInt();
            int [] array = new int[size];
            for (int i = 0; i < array.length; i++){
                System.out.print("Enter the digit of " + (i+1) + " place: ");
                int value = input.nextInt();
                array[i] = value;
            }
            return array;
    }
}
