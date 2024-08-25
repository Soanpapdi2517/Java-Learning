import java.util.Scanner;

public class ignoreNegativeNum {
    public static void main(String[] args) {
        System.out.println("Enter to know sum of your all positive number");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Enter your positive number: ");
            int num = input.nextInt();
            if (num < 0){
                continue;
            }
            sum += num;
            System.out.println("Now, Your sum is " + sum);
        }
    }
}
