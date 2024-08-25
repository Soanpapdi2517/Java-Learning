import java.util.Scanner;

public class PrintOnlyEven {
    public static void main(String[] args) {
        System.out.println("Welcome to get even numbers till your entered number\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
