import java.util.Scanner;

public class LeapYear_challen {
    public static void main(String[] args) {
        System.out.println("Welcome to our leap year calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year to know its leap year or not: ");
        int year = input.nextInt();
        if (year%4 == 0 && year%100!= 0 || (year%400==0)){
            System.out.println(year + " Your entered year is a leap year");
        } else {
            System.out.println("your entered year is not a leap year");
        }
    }
}
