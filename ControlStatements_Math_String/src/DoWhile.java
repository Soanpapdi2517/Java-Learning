import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Welcome to Accept Age from user \n");
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Age: ");
//        int age = input.nextInt();
//        while (age < 0 || age > 100){
//            System.out.print("Don't joke, please Enter your Age: ");
//            age = input.nextInt();
//        }
        int age;
        do {
            System.out.print("Enter your Age: ");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your Age is: " + age);
    }
}
