import java.util.Scanner;

public class Switch_Op_Use {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to month calculator\n ");
        System.out.print("Enter your day in num");
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);
    }
    public static void oldSwitch(int day){
        switch (day) {
            case 1:
                System.out.println("Your entered Day is Monday");
                break;
            case 2:
                System.out.println("Your entered Day is Tuesday");
                break;
            case 3:
                System.out.println("Your entered Day is Wednesday");
                break;
            case 4:
                System.out.println("Your entered Day is Thursday");
                break;
            case 5:
                System.out.println("Your entered Day is Friday");
                break;
            case 6: // if we don't use break it automatically
                // goes into other case and print it the same
            case 7:
                System.out.println("Your entered Day is Holiday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void newSwitch(int day){
        String dayName  = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7, 8 -> "Your day is holiday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
    }
}
