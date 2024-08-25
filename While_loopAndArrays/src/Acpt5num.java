import java.util.Scanner;

public class Acpt5num {
    public static void main(String[] args) {
        System.out.println("Welcome here we accept your 5 numbers");
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i<5){
            System.out.print("Enter your number: ");
            int num = input.nextInt();
            System.out.println("You Entered number: " + num);
            i+=1;
        }
    }
}
