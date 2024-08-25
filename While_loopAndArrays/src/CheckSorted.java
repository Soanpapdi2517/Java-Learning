public class CheckSorted {
    public static void main(String[] args) {
        int [] myArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(myArr);
        boolean isdec = isdecreasing(myArr);
        if (isdec || isInc){
            System.out.println("Your Array is sorted");
        } else {
            System.out.println("your array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] myArr){
        int i = 2;
        while (i < myArr.length){
            if (myArr[i] <= myArr[i-2]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isdecreasing(int[] myArr){
        int i = 2;
        while(i < myArr.length){
            if(myArr[i] >= myArr[i-2]){
                return false;
            }
            i++;
        }
        return true;
    }
}
