import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to get sum of your positive numbers " +
                " !!!Warning !!!Don't put negative numbers");
        int [] myarray = ArrayUltility.inputArray();
        int sum = 0;
        for(int num : myarray) {
            if (num < 0){
                continue;
            }
            sum += num;
        }
        System.out.println("Here's your sum " + sum);
    }
}
