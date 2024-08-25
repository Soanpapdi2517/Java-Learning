public class SumPositive {
    public static void main(String[] args) {
        System.out.println("Enter your array and we will provide you sum of positive numbers in your array\n");
        int [] myArray = ArrayUtility.inputarray();
        int sum =  0;
        for (int num : myArray){
            if (num < 0){
                continue;
            }
            sum += num;
        }
        System.out.println("sum of positive numbers in your array is: " + sum);
    }
}
