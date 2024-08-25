public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse of an array\n");
        int[] oldArray = ArrayUtility.inputArray();
        newArray(oldArray);
        System.out.println("Your reversed array is: ");
        ArrayUtility.displayArray(oldArray);
    }
    public static void newArray(int[] oldArray){
        int i = 0;
        while (i < oldArray.length/2){
            int swap = oldArray[i];
            oldArray[i] = oldArray[(oldArray.length - 1) - i];
            oldArray[(oldArray.length - 1) - i] = swap;
            i++;
        }
    }
}
