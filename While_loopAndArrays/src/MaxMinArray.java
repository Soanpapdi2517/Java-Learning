import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();

        System.out.println("welcome to know max and minimum in your array\n");
        System.out.println("The maximum number in your Array is: " + Max(numArray));
        System.out.println("The maximum number in your Array is: " + min(numArray));
    }
    public static int Max(int[] numArray){
        if (numArray.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];                 //BOTH ARE THE APPROACHES
                                               // WE HAVE CHOICE TO CHOOSE ONE
        int i = 1;
        while(i < numArray.length){
            if (max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numArray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length){
            if (min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}
