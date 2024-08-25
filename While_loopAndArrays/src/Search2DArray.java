import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] newArray = ArrayUtility.input2DArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to search in Array: ");
        int numSearch = input.nextInt();
        Boolean isAvailable = isAvailable(newArray,numSearch);
        if (isAvailable){
            System.out.println("your entered number is found");
        }else {
            System.out.println("your entered number is not found");
        }
    }
    public static boolean isAvailable(int[][] newArray, int num){
        int i = 0;
        while (i < newArray.length){
            int j = 0;
            while (j < newArray[i].length){
                if (newArray[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
