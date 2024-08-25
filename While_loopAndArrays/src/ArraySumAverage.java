public class ArraySumAverage {
    public static void main(String[] args) {
        int[] sumAverage = ArrayUtility.inputArray();
        double sum = Sum(sumAverage);
        System.out.println("Average of your entered number is: " + (double) (sum/sumAverage.length));
    }
    public static double Sum(int[] sumAverage){
        int sum = 0;
        int i = 0;
        while (i < sumAverage.length){
            sum += sumAverage[i];
            i++;
        }
        return sum;
    }
}
