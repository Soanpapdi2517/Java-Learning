import java.util.Scanner;

public class Array_searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {89, 56, 32, 98, 73, 82, 65, 93, 74, 61, 53, 49, 41, 31, 93, 84, 96, 75, 50};
        System.out.print("Enter your index number: ");
        int num = input.nextInt();
        boolean isnumfound = isfound(nums, num);
        if(isnumfound){
            System.out.print("Your entered number was found");
        }else {
            System.out.println("Your entered number was not found");
        }
    }
    public static boolean isfound(int[] nums, int num){
        int index = 0;
        while (index < nums.length){
            if (nums[index] == num){
                System.out.println("Your number is on index no." + (index+1));
                return true;
            }
            index++;

        }
        return false;
    }
}
