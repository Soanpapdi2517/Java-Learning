public class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to know the sum and average of your 2D Array");
        int[][] main2DArray = ArrayUtility.input2DArray();
        int sum = sum(main2DArray);
        int count = Count(main2DArray);
        System.out.print("Average of your array is " +(double) sum/count);
    }
    public static int sum (int[][] main2DArray){
        int i = 0;
        int sum = 0;
        while (i < main2DArray.length){
            int j = 0;
            while (j < main2DArray[i].length){
                sum += main2DArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static int Count(int[][] Array2D){
        int i = 0;
        int count = 0;
        while (i < Array2D.length){
            int j = 0;
            while (j < Array2D[i].length){
                count++;
                j++;
            }
            i++;
        }
        return count;
    }
}
