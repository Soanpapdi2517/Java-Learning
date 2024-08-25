public class unaryop {
    public static void main(String[] args) {
        int x = 6; //minus changes the value of number +ve to -ve and -ve to +ve
        int y = -x;
        int z = -y;
        System.out.println(y);
        int p = 7;
        System.out.println("\npost increment");
        System.out.println(p++); // in post increment it first print actual value
        System.out.println(p); // and when we again print it then it increments

        int a = 2;
        System.out.println("\npre increment"); //pre increment direct increments when we use it
        System.out.println(++a);

        System.out.println("post decrement");
        int q = 7;
        System.out.println(q--); // in post decrement it first print actual value
        System.out.println(q); // and when we again print it then it decrements

        System.out.println("pre decrement"); //pre increment direct increments when we use it
        int d = 8;
        System.out.println(--p);
    }
}
