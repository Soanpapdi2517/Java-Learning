import java.util.Scanner;

public class MaxForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to know Maximum of your array");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int size = input.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter the digit of " + (i+1) + " place: ");
            int value = input.nextInt();
            array[i] = value;
        }
        int max = maxinArray(array);
        System.out.println("this is your max value " + max);
    }
    public static int maxinArray(int [] array){
        int max = Integer.MIN_VALUE;
        for(int num : array){
            if (max < num){
                max = num;
            }
        }return max;
    }
}
