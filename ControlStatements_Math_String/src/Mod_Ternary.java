import java.util.Scanner;

public class Mod_Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to make your number into absolute");
        System.out.print("Enter your number to change it in absolute: ");
        int num = input.nextInt();


        int absoluteNum =  num <= 0 ? -num : num;
        System.out.print(absoluteNum);
    }
}
