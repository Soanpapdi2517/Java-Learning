public class Orderofoperation {
    public static void main(String[] args) {
        System.out.println(8-3*3); //preference is BODMAS bracket first Order 2nd divide 3rd multiply 4rth
        //add 5th minus 6th
        System.out.println((8-3)*3); // but if we put bracket to get favourable result

        System.out.println(9/3*8/2); // in this type of expression where same operator we are using
        // without bracket again and again then it will start solving from left -----> right
    }
}
