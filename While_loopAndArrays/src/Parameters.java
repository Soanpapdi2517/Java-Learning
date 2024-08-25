public class Parameters {
    public static void main(String[] args) {
        // Arguments are the numbers or variables passed for which parameters we defined
        System.out.println(sum2Nums(89, 52));
        System.out.println(sum2Nums(30, 50));
        System.out.println(sum2Nums(8, 2));
        System.out.println(sum2Nums(-56, 56));
    }

    public static int sum2Nums(int x, int y){ // parameters are the datatype or variable which we want in arguments later
        System.out.println("Enter your first number: " + x);
        System.out.println("Enter your first number: " + y);
        int num;
        return x + y;
    }
}
