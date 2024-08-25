import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to our pyramids");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = input.nextInt();
        rightpyramid(x);
        revRightPyramid(x);
        lefthandpyramid(x);
    }
    public static void rightpyramid(int x){
        int i = 0;

        while (i < x){
            System.out.print("*");
            int num = 0;
            while(num < i){
                System.out.print(" *");
                num++;
            }
            System.out.println();
            i++;
        }
    }
    public static void revRightPyramid(int y){
        int line = y;
        while(line > 0) {
            int col = 0;
            while (col < line){
                System.out.print("+");
                col++;
            }
            System.out.println();
            line--;
        }

    }
    public static void lefthandpyramid(int z){
        int rows = z;
        while (rows > 0){
            int k = 0;
            while (k < rows - 1){
                System.out.print("  ");
                k++;
            }
            int p = 0;
            while (p <= (z-rows)){
                System.out.print("* ");
                p++;
            }
            System.out.println();
            rows--;
        }
    }
}
