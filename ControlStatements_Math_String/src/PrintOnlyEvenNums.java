import java.util.Scanner;

public class PrintOnlyEvenNums {
    public static void main(String[] args) {
        System.out.println("Welcome to sun of even nums only till the entered num");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your num : ");
        int num = input.nextInt();
        for(int i = 0; i <= num; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);

        }
    }
}
