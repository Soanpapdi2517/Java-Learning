import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to get multiplication table ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to gets its multiplication table: ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
