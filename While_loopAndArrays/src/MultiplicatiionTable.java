import java.util.Scanner;

public class MultiplicatiionTable {
    public static void main(String[] args) {
        System.out.println("Welcome to  our table Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        table_calculator(num);
    }
    public static void table_calculator(int num){
        int i = 1;
        while (i<=10){
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
    }
}