import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("write your name here:");
        String name = input.nextLine();
        System.out.println("Good Morning" + name);
        System.out.print("Hi " + name + " Please tell me your age:");
        int age = input.nextInt();
        System.out.println("Hi " + name + " your age is " + age);
    }
}
