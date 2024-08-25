import java.util.Scanner;

public class MonthInAnYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Know month by entering number (1-12)");
        System.out.print("Enter your month number: ");
        int monthNum = input.nextInt();
        String month = switch (monthNum){
            case 1 -> "January";
            case 2 -> "febuary";
            case 3 -> "March";
            case 4 -> "April";
            case 5-> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "september";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println("Your entered month is: " + month);
    }
}
