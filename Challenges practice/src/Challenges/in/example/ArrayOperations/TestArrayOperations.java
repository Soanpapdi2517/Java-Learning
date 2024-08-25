package Challenges.in.example.ArrayOperations;

import java.util.Scanner;

public class TestArrayOperations {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of your array: ");
            int size = input.nextInt();
            int [] myarray = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter your number at " + (i + 1) + " place: ");
                myarray[i] = input.nextInt();
            }
            ArrayOperations arrOpr = new ArrayOperations(myarray);
        ArrayOperations.statistics stats = new ArrayOperations.statistics();
        System.out.println(stats.mean());
        System.out.println(stats.median());
    }
}
