import java.lang.annotation.ElementType;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of elements: ");
        int size = input.nextInt();
        int[] arraySize = new int[size];
        int i = 0;
        while (i < arraySize.length) {
            System.out.print("Enter the " + (i + 1) + " Number: ");
            int valueofelements = input.nextInt();
            arraySize[i] = valueofelements;
            i++;
        }
        return arraySize;
    }
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows in your 2D Array: ");
        int rowsize = input.nextInt();
        System.out.print("Enter number of columns in your 2D Array: ");
        int columnsize = input.nextInt();
        int [][] main2DArray = new int[rowsize][columnsize];
        int i = 0;
        while (i < rowsize){
            int j = 0;
            while(j < columnsize){
                System.out.print("Enter your " + (j + 1) + " column value of " + (i + 1) + " row: ");
                main2DArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }return main2DArray;

    }
    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }
}
