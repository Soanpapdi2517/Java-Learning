import java.util.Scanner;

public class Challenge_MonthName {
    public static void main(String[] args) {
        System.out.println("Welcome to know the months name according to your number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your month's number: ");
        int month = input.nextInt();
        String monthName = getMonthName(month);
        System.out.println("Month name according to your entered number is " + monthName);

    }
    public static String getMonthName(int month){
        return switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}
