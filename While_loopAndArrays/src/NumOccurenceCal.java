import java.util.Scanner;

public class NumOccurenceCal {
    public static void main(String[] args) {
        int[] NumOccurCal = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number which you want to calculate in our array");
        int numOccured = input.nextInt();
        int numOccurence = numOccurence(NumOccurCal, numOccured);
        System.out.println("Your entered number is occured: " + numOccurence);

        }

        public static int numOccurence(int[] NumOccurCal, int numOccured) {
            int i = 0;
            int occurence = 0;
            while (i < NumOccurCal.length) {
                if (NumOccurCal[i] == numOccured) {
                    occurence++;
                }
                i++;
            }
            return occurence;
        }
}
