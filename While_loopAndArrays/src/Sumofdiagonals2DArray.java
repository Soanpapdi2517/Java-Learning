public class Sumofdiagonals2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to know the sum of diagonals of your 2D Array\n");
        int[][] my2DArray = ArrayUtility.input2DArray();
        long sumofdiagonals =sumofDiagonals(my2DArray);
        System.out.println("Sum of diagonals of your entered array is " + sumofdiagonals);
    }
    public static long sumofDiagonals(int[][] array2D){
        long rightsum = sumOfRightDiagonal(array2D);
        long leftsum = sumofLeftdiagonal(array2D);
        long sum = rightsum + leftsum;                // VALID FOR SQUARE MATRIX THAT'S WHY
                                                     // WE ARE TAKING ONLY ONE SIDE ALWAYS
        if (array2D.length % 2 != 0){
            int midOf2DArray = array2D.length / 2;
            sum -=array2D[midOf2DArray][midOf2DArray];
        } return sum;
    }
    public static long sumOfRightDiagonal(int[][] my2DArray) {
        long sum = 0;
        int i = 0;
        while (i < my2DArray.length){
            sum = sum + my2DArray[i][my2DArray.length - 1 - i];
            i++;
        }
        return sum;
    }
    public static long sumofLeftdiagonal(int[][] my2DArray){
// left diagonal with index places like (0,0), (1,1), (2,2) in a sqaure matrix(2DArray)
        int i = 0;
        long sum = 0;
        while (i < my2DArray.length){
            sum = sum + my2DArray[i][i];
            i++;
        }
    return sum;
    }

}
