import java.util.Scanner;

public class LcmOf2Nums {
    public static void main(String[] args) {
        System.out.println("Welcome to our LCM calculator\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        int leastCM = lcm(first, second);
        System.out.println("LCM of entered digit is: " + leastCM);
    }
    public static int lcm(int x, int y){
        int i = 1;
        while (true){
            int into = x * i;
            if (into % y == 0){
                return into;
            } i++;
        }
    }
}
