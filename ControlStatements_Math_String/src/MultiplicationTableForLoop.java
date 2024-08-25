import java.util.Scanner;

public class MultiplicationTableForLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to know multiplication table of your number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to get its multiplication table: ");
        int num = input.nextInt();
        int into = 1;
        for (int i = 1; i <= 10; i++){
            into = i * num;
            System.out.println(num + " X " + i + " = " + into);
        }
    }
}
