import java.util.Scanner;

public class DeletingfromArray {
    public static void main(String[] args) {
        System.out.println("Welcome  to deletion of numbers in an array");
        int[] oldArray = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to delete: ");
        int num = input.nextInt();
        int[] newArray = deletenumber(oldArray, num);
        ArrayUtility.displayArray(newArray);
    }
    public static int[] deletenumber(int[] oldArray, int numtodelete) {
        int occ = NumOccurenceCal.numOccurence(oldArray, numtodelete);
        if (occ == 0) {
            return oldArray;
        }
        int newsize = oldArray.length - occ;
        int[] newArray = new int[newsize];
        int i = 0, j = 0;
        while (i < oldArray.length){
            if (oldArray[i] != numtodelete) {
                newArray[j] = oldArray[i];
                j++;
            }
            i++;
        }



        return newArray;
    }
}
