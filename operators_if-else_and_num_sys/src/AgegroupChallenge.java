import java.util.Scanner;

public class AgegroupChallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to age group calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter person's name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age<=13 && age>0){
            System.out.println(name + " is Child");
        } else if (age<=20 && age>0) {
            System.out.println(name + " is Teen");
        } else if (age<=60 && age>0) {
            System.out.println(name + " is adult");
        }else if (age>=60 && age<=120){
            System.out.println(name + " is senior citizen");
        }else{
            System.out.println("You have entered wrong age please try again");
        }
    }
}
