import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to multiplication table calculator\n");
        System.out.print("Enter the number to know of table : ");
        int num = input.nextInt();
        int lastValue = num * 9;
        int table = 0;
        while (table <= lastValue){
            table = table + num;
            System.out.println(num + " your table of entered number is: " + table);
        }
    }
}
