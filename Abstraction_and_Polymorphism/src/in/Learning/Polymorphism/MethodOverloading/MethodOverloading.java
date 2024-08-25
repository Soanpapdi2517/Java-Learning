package in.Learning.Polymorphism.MethodOverloading;

import java.util.Scanner;

public class MethodOverloading {
    Scanner input = new Scanner(System.in);
//    CONSTRUCTOR metho
    MethodOverloading(){
        System.out.println("This is the default constructor");
    }
    MethodOverloading(String pop){
        System.out.println(pop);
    }
//    METHOD OVERLOADING
    public int add(int x, int y){
        return x+y;
    }
    public int add(int x, int y, int z){
        return x+y+z;
    }
    public String add(String x, String y){
        return x + y;
    }
    public int add(int x){
        int sum = 0;
        for (int i = 0; i < x; i++) {
            System.out.print("Enter "+ (i+1) +" number to sum the entered numbers: ");
            int num = input.nextInt();
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodOverloading mo  = new MethodOverloading();
//        int sum = mo.add(5);
//        System.out.println(sum);
        System.out.println(mo.add(5, 7));
        System.out.println(mo.add("sonu", "Yadav"));
        System.out.println(mo.add(4,5,6));
        MethodOverloading mo2 = new MethodOverloading("Learning");
    }

}
