public class ArraySort {
    public static void main(String[] args) {
        int[] myArray = ArrayUltility.inputArray();
        for (int i = 0; i < myArray.length-1; i++) {
            System.out.println("running for i = " + i);
            for (int j = 0; j < myArray.length- i -1; j++) {
                System.out.println("Running for j = " + j);
                if (myArray[j] > myArray[j+1]) {
                    for (int num: myArray){
                        System.out.print(num + " ");
                    }
                    System.out.println(" \nBefore " + myArray [j] + " & " + myArray[j+1]);
                    // Swap arr[j] and arr[j+1]
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                    System.out.println(" \nAfter " + myArray[j] + " & " + myArray[j+1]);
                    for (int num : myArray){
                        System.out.print(num + " ");
                    }
                }
            }
        }
        System.out.println((double) myArray.length/2);
    }
}
