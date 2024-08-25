import java.util.Scanner;

public class Chall_intergers_nature {
    public static void main(String[] args) {
        System.out.println("Welcoome to interger determiner whether its zero, +ve & -ve");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to see it is what type of interger");
        double num = input.nextDouble();
        if (num>0){
            System.out.println(num + " This number is +ve");
        } else if (num<0) {
            System.out.println(num + " This number is -ve");
        } else {
            System.out.println(num + "This number is Zero");
        }
    }
}
