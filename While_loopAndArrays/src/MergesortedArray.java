public class MergesortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to merging two sorted arrays\n");
        int[] firstArray = ArrayUtility.inputArray();
        int[] secondArray = ArrayUtility.inputArray();
        int[] mergedArray = mergedArray(firstArray, secondArray);
        System.out.print("Your Merged Array is: ");
        ArrayUtility.displayArray(mergedArray);
    }
    public static int[] mergedArray(int[] array1, int[] array2){
        int mergedArraySized = array1.length + array2.length;
        int[] mergedArray = new int[mergedArraySized];
        int i = 0, j = 0, k = 0;
        while (i < array1.length || j < array2.length) {
            if (j == array2.length || (i < array1.length && array1[i] < array2[j])){
                mergedArray[k] = array1[i];
                i++;
                k++;
            }else {
                mergedArray[k] = array2[j];
                j++;
                k++;
            }
        }
        return mergedArray;
    }
}
