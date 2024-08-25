import java.util.Scanner;

public class ForMax {
    public static void main(String[] args) {
        System.out.println("Welcome to get your maximum value of array\n");
        int[] myArray = ArrayUltility.inputArray();
        int max = Integer.MIN_VALUE;
        for(int num: myArray){
            if (max < num){
                max = num;
            }
        }
        System.out.println("Max value of your array is: " + max);
    }
}
