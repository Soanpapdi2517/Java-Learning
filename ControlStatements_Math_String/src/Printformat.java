public class Printformat {
    public static void main(String[] args) {
        System.out.printf("Welcome to learn print formats to stop concatination %s",
                "(Reason on using concatination more memory is used to stop the waste of concationation we use proper print formats)");
        String name = "Sonu";
        int rank = 1996932;
        System.out.printf("%n Hello, %s Your rank is: %d" , name, rank);
        System.out.printf("%n Hello, %-7s Your rank is: %,15d" , name, rank);
        System.out.printf("%n Hello, %15s Your rank is: %-15d" , name, rank);
        System.out.printf("%n Hello, %-15S Your rank is: %-+15d" , name, rank);
        System.out.printf("%n Hello, %15S Your rank is: %0,15d" , name, rank);
        System.out.printf("%n Hello, %-15s Your rank is: %+,5d" , name, rank);
        System.out.printf("%n Hello, %-15s Your rank is: %(9d" , name, rank);


    }
}
