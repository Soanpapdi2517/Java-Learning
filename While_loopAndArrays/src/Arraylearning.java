public class Arraylearning {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[2] = 98;
//        myArr[1] = 78;
//        myArr[3] = 89;
//        myArr[0] = 69;
//        myArr[4] = 45;
        int[] myArr = {69,78,98,89,45};
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
        // Array traversal
        int index = 0; //we don't need to remember array's length we can also find it using {array variable name}.length---->myArr.length
        while (index<myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
    }
}
